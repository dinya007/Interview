package interview.interviews;

import java.util.HashMap;
import java.util.Map;

public abstract class Digest {
    private Map<byte[], byte[]> cache = new HashMap<byte[], byte[]>();

    public byte[] digest(byte[] input) {
        byte[] result = cache.get(input); // ←-
        if (result == null) {
            synchronized(cache) { // ←--
                result = cache.get(input); // ←-;
                if (result  == null) {
                    result = doDigest(input);
                    cache.put(input, result);
                }
            }
        }
        return result;
    }

    protected abstract byte[] doDigest(byte[] input);


    private static class MyDigest extends Digest {

        @Override
        protected byte[] doDigest(byte[] input) {
            System.out.println("Do digest");
            return input;
        }
    }

    public static void main(String[] args) {
        Digest digest = new MyDigest();

        String string1 = "string1";

        System.out.println(new String(digest.digest(string1.getBytes())));
        System.out.println(new String(digest.digest(string1.getBytes())));
    }

}


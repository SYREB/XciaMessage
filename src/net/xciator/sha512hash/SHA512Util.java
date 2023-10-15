package net.xciator.sha512hash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.nio.charset.StandardCharsets;

public class SHA512Util {
    public String getSHA512hash(String input) {
        try {
            // 创建SHA-512散列算法实例
            MessageDigest md = MessageDigest.getInstance("SHA-512");

            // 将输入字符串转换为字节数组
            byte[] bytes = input.getBytes(StandardCharsets.UTF_8);

            // 计算散列值
            byte[] hashBytes = md.digest(bytes);

            // 将字节数组转换为十六进制字符串
            StringBuilder hexString = new StringBuilder();
            for (byte b : hashBytes) {
                String hex = Integer.toHexString(0xFF & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
        String input = "Hello, World!";
        String sha512Hash = getSHA512hash(input);
}

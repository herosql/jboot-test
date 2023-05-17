package cn.sqlhero;

import io.jboot.app.config.JbootConfigDecryptor;

/**
 * encrypt
 *
 * @author ：sqlhero.
 * @date ：Created in 2023/5/17 下午5:30
 */
public class EncryptPropertyPlaceholderConfigurer implements JbootConfigDecryptor {
    public String decrypt(String key, String originalContent) {
        System.out.println("Decrypt:" + key + ";Value:" + originalContent);
        if(key.equals("xx.url")){
            System.out.println("success");
            return "http://www.github.com";
        }
        return originalContent;
    }
}

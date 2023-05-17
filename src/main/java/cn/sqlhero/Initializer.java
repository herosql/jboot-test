package cn.sqlhero;

import io.jboot.app.config.JbootConfigManager;
import io.jboot.core.listener.JbootAppListenerBase;

/**
 * init
 *
 * @author ：sqlhero.
 * @date ：Created in 2023/5/17 下午5:29
 */
public class Initializer extends JbootAppListenerBase {
    @Override
    public void onInit() {
        JbootConfigManager.me().setDecryptor(new EncryptPropertyPlaceholderConfigurer());
    }
}
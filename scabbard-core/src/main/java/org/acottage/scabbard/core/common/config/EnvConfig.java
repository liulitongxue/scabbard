package org.acottage.scabbard.core.common.config;

import org.springframework.util.StringUtils;

/**
 * @Author liuli
 * @Email liulitongxue@126.com
 * @Date 2020/09/11 下午 4:29
 * @Version 1.0
 *
 * 环境配置类
 */
public class EnvConfig {

    /**
     * 当前运行的环境
     */
    public static Env currentEnv = null;

    public static boolean isDev() {
        return currentEnv == Env.DEV;
    }

    public static boolean isTest() {
        return currentEnv == Env.TEST;
    }

    public static boolean isProd() {
        return currentEnv == Env.PROD;
    }

    public enum Env {
        /**
         * 当前运行该环境
         */
        DEV("dev"),
        TEST("test"),
        PROD("prod");

        Env(String env) {
            this.env = env;
        }

        public String getEnv() {
            return env;
        }

        public void setEnv(String env) {
            this.env = env;
        }

        private String env;

        public static Env parseEnv(String envStr) {
            if (StringUtils.isEmpty(envStr)) {
                return null;
            }
            Env[] envs = Env.values();
            for (Env env : envs) {
                if (envStr.equals(env.getEnv())) {
                    return env;
                }
            }
            return null;
        }
    }
}

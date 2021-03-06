/*
 * Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbon.secvault;

/**
 * Secure Vault Constants.
 *
 * @since 5.0.0
 */
public class SecureVaultConstants {

    public static final String SECURE_VAULT_CONFIG_YAML_FILE_NAME = "secure-vault.yaml";
    public static final String SECRETS_PROPERTIES_FILE_NAME = "secrets.properties";
    public static final String MASTER_KEYS_FILE_NAME = "master-keys.yaml";
    public static final String CIPHER_TEXT = "cipherText";
    public static final String PLAIN_TEXT = "plainText";
    public static final String SPACE = " ";
    public static final String SECUREVAULT_NAMESPACE = "wso2.securevault";
    public static final String STREAMLINED_SECUREVAULT_NAMESPACE = "securevault";

    // System and environment variables
    public static final String MASTER_KEYS_YAML_CONFIG_PROPERTY = "masterKeyReaderFile";
    public static final String SECRET_PROPERTIES_CONFIG_PROPERTY = "secretPropertiesFile";

    public static final String DEFAULT_SECRET_REPOSITORY =
                                                    "org.wso2.carbon.secvault.repository.DefaultSecretRepository";
    public static final String DEFAULT_PRIVATE_KEY_ALIAS = "wso2carbon";
    public static final String DEFAULT_KEYSTORE_LOCATION = "${sys:carbon.home}/resources/security/securevault.jks";
    public static final String DEFAULT_SECRET_PROPERTIES_FILE =
                                                    "${sys:carbon.home}/conf/${sys:wso2.runtime}/secrets.properties";

    public static final String DEFAULT_MASTER_KEY_READER = "org.wso2.carbon.secvault.reader.DefaultMasterKeyReader";
    public static final String DEFAULT_MASTER_KEY_READER_FILE =
                                                    "${sys:carbon.home}/conf/${sys:wso2.runtime}/master-keys.yaml";


    /**
     * Remove default constructor and make it not available to initialize.
     */
    private SecureVaultConstants() {
        throw new AssertionError("Trying to a instantiate a constant class");
    }
}

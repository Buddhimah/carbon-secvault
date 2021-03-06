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

package org.wso2.carbon.secvault.model;

/**
 * SecureVaultConfiguration class holds static configuration parameters specified in the secure-vault.yaml file.
 *
 * @since 5.0.0
 */
public class SecureVaultConfiguration {
    private SecretRepositoryConfiguration secretRepository;
    private MasterKeyReaderConfiguration masterKeyReader;

    /**
     * Get secret repository configuration.
     *
     * @return secret repository configuration
     */
    public SecretRepositoryConfiguration getSecretRepositoryConfig() {
        return secretRepository;
    }

    /**
     * Get master key reader configuration.
     *
     * @return master key reader configuration
     */
    public MasterKeyReaderConfiguration getMasterKeyReaderConfig() {
        return masterKeyReader;
    }

    public void setSecretRepository(SecretRepositoryConfiguration secretRepository) {
        this.secretRepository = secretRepository;
    }

    public void setMasterKeyReader(MasterKeyReaderConfiguration masterKeyReader) {
        this.masterKeyReader = masterKeyReader;
    }
}

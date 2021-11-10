/*
 * *
 *  * Copyright 2021 Shulie Technology, Co.Ltd
 *  * Email: shulie@shulie.io
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  * http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package com.pamirs.attach.plugin.zto.spi;

import com.shulie.instrument.module.config.fetcher.config.spi.ShadowDatabasePasswordProvider;

/**
 * @author jiangjibo
 * @date 2021/11/10 2:11 下午
 * @description: 中通影子库密码获取
 */
public class ZtoJdbcShadowDatabasePasswordProvider implements ShadowDatabasePasswordProvider {

    @Override
    public String getShadowDatabasePassword(String url, String userName, String accessKey) {
        return null;
    }
}

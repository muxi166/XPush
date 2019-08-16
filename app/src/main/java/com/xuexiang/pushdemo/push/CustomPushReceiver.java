/*
 * Copyright (C) 2019 xuexiangjys(xuexiangjys@163.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.xuexiang.pushdemo.push;

import android.content.Context;

import com.xuexiang.xpush.core.impl.XPushReceiver;
import com.xuexiang.xpush.entity.XPushCommand;
import com.xuexiang.xpush.entity.XPushMsg;

/**
 * @author xuexiang
 * @since 2019-08-16 17:50
 */
public class CustomPushReceiver extends XPushReceiver {

    @Override
    public void onNotificationClick(Context context, XPushMsg msg) {

    }

    @Override
    public void onMessageReceived(Context context, XPushMsg msg) {

    }

    @Override
    public void onCommandResult(Context context, XPushCommand command) {

    }
}
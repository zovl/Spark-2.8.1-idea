/**
 * $RCSfile: ,v $
 * $Revision: $
 * $Date: $
 * <p>
 * Copyright (C) 2004-2011 Jive Software. All rights reserved.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jivesoftware.sparkplugin.callhistory;


/**
 *
 */
public class HistoryCall {
    private String callerName;

    private String number;

    private String groupName;

    private long time;

    private long callLength;

    public HistoryCall() {

    }

    public HistoryCall(String callerName, String number, String groupName, long time, long callLength) {
        this.callerName = callerName;
        this.number = number;
        this.groupName = groupName;
        this.time = time;
        this.callLength = callLength;
    }

    public String getCallerName() {
        if (callerName.equals(number)) {
            return getNumber();
        }
        return callerName;
    }

    public void setCallerName(String callerName) {
        this.callerName = callerName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }


    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }


    public long getCallLength() {
        return callLength;
    }

    public void setCallLength(long callLength) {
        this.callLength = callLength;
    }
}

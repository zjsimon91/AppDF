/*******************************************************************************
 * Copyright 2012 One Platform Foundation
 * 
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 * 
 *        http://www.apache.org/licenses/LICENSE-2.0
 * 
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 ******************************************************************************/
package org.onepf.appdf.parser;

import java.util.zip.ZipFile;

import org.onepf.appdf.model.Application;

public class ParseResult {
    private final Application application;
    private final ZipFile file;

    protected ParseResult(Application application, ZipFile file) {
        this.application = application;
        this.file = file;
    }

    public Application getApplication() {
        return application;
    }

    public ZipFile getFile() {
        return file;
    }

}
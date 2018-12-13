
/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package software.amazon.awssdk.crt.test;

import org.junit.Test;
import static org.junit.Assert.*;
import software.amazon.awssdk.crt.testing.CrtTest;
import software.amazon.awssdk.crt.CrtRuntimeException;

public class RuntimeExceptionTestAPI {
    public RuntimeExceptionTestAPI() { }

    @Test
    public void ensureRuntimeExceptionsCanBeThrownFromNativeViaAPI() {
        boolean exceptionCaught = false;
        try (CrtTest test = new CrtTest()) {
            test.throwRuntimeExceptionAPI();
        } catch (CrtRuntimeException ex) {
            exceptionCaught = true;
        }
        assertTrue(exceptionCaught);
    }
};

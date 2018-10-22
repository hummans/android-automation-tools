/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

package org.mozilla.apt

import org.mockito.Mockito.mock

internal class TestServiceLocator : ServiceLocator() {

    companion object {
        fun getMockAndOverride(): TestServiceLocator = mock(TestServiceLocator::class.java).also {
            TestServiceLocator().overrideInstance(it) // we can't call methods on a mock so we create a new instance.
        }
    }
}

/*
 * Copyright 2015 Benjamin Gandon
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package org.killbill.billing.test.helpers;

import java.util.UUID;

import org.killbill.billing.ObjectType;
import org.killbill.billing.plugin.simpletax.util.ImmutableCustomField;
import org.killbill.billing.util.customfield.CustomField;

@SuppressWarnings("javadoc")
public class CustomFieldBuilder implements Builder<CustomField> {

    private UUID objectId;
    private ObjectType objectType;
    private String fieldName, fieldValue;

    @Override
    public CustomField build() {
        return ImmutableCustomField.builder()//
                .withObjectId(objectId)//
                .withObjectType(objectType)//
                .withFieldName(fieldName)//
                .withFieldValue(fieldValue)//
                .build();
    }

    public static CustomFieldBuilder copy(CustomFieldBuilder that) {
        return new CustomFieldBuilder()//
                .withObjectType(that.objectType)//
                .withObjectId(that.objectId)//
                .withFieldName(that.fieldName)//
                .withFieldValue(that.fieldValue);
    }

    public CustomFieldBuilder withObjectId(UUID objectId) {
        this.objectId = objectId;
        return this;
    }

    public CustomFieldBuilder withObjectType(ObjectType objectType) {
        this.objectType = objectType;
        return this;
    }

    public CustomFieldBuilder withFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    public CustomFieldBuilder withFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
        return this;
    }
}

/*
 * Copyright (c) 2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

/**
 * Autogenerated by Thrift Compiler (0.7.0)
 * <p/>
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.wso2.carbon.identity.entitlement.thrift;

import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public class EntitlementException extends Exception
        implements org.apache.thrift.TBase<EntitlementException, EntitlementException._Fields>, java.io.Serializable,
                   Cloneable {

    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    public static final String ENTITLEMENT_EXCEPTION = "EntitlementException";
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct
            (ENTITLEMENT_EXCEPTION);
    public static final String MESSAGE = "message";
    private static final org.apache.thrift.protocol.TField MESSAGE_FIELD_DESC = new org.apache.thrift.protocol.TField
            (MESSAGE, org.apache.thrift.protocol.TType.STRING, (short) 1);

    static {
        Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<>(_Fields.class);
        tmpMap.put(_Fields.MESSAGE, new org.apache.thrift.meta_data.FieldMetaData(MESSAGE, org.apache.thrift
                .TFieldRequirementType.REQUIRED, new org.apache.thrift.meta_data
                .FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        metaDataMap = Collections.unmodifiableMap(tmpMap);
        org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(EntitlementException.class, metaDataMap);
    }

    // isset id assignments
    public String message; // required

    public EntitlementException() {
    }

    public EntitlementException(
            String message) {
        this();
        this.message = message;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public EntitlementException(EntitlementException other) {
        if (other.isSetMessage()) {
            this.message = other.message;
        }
    }

    public EntitlementException deepCopy() {
        return new EntitlementException(this);
    }

    @Override
    public void clear() {
        this.message = null;
    }

    public String getMessage() {
        return this.message;
    }

    public EntitlementException setMessage(String message) {
        this.message = message;
        return this;
    }

    public void unsetMessage() {
        this.message = null;
    }

    /**
     * Returns true if field message is set (has been assigned a value) and false otherwise
     */
    public boolean isSetMessage() {
        return this.message != null;
    }

    public void setMessageIsSet(boolean value) {
        if (!value) {
            this.message = null;
        }
    }

    public void setFieldValue(_Fields field, Object value) {
        switch (field) {
            case MESSAGE:
                if (value == null) {
                    unsetMessage();
                } else {
                    setMessage((String) value);
                }
                break;

        }
    }

    public Object getFieldValue(_Fields field) {
        switch (field) {
            case MESSAGE:
                return getMessage();

        }
        throw new IllegalStateException();
    }

    /**
     * Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
     */
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }

        switch (field) {
            case MESSAGE:
                return isSetMessage();
        }
        throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
        return that != null && that instanceof EntitlementException && this.equals((EntitlementException) that);
    }

    public boolean equals(EntitlementException that) {
        if (that == null) {
            return false;
        }

        boolean this_present_message = this.isSetMessage();
        boolean that_present_message = that.isSetMessage();
        if (this_present_message || that_present_message) {
            if (!(this_present_message && that_present_message)) {
                return false;
            }
            if (!this.message.equals(that.message)) {
                return false;
            }
        }

        return true;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public int compareTo(EntitlementException other) {
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }

        int lastComparison = 0;
        EntitlementException typedOther = other;

        lastComparison = Boolean.valueOf(isSetMessage()).compareTo(typedOther.isSetMessage());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetMessage()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.message, typedOther.message);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        return 0;
    }

    @Override
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TField field;
        iprot.readStructBegin();
        while (true) {
            field = iprot.readFieldBegin();
            if (field.type == org.apache.thrift.protocol.TType.STOP) {
                break;
            }
            if (field.id == 1) {
                if (field.type == org.apache.thrift.protocol.TType.STRING) {
                    this.message = iprot.readString();
                } else {
                    org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
                }
            } else {
                org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            }
            iprot.readFieldEnd();
        }
        iprot.readStructEnd();

        // check for required fields of primitive type, which can't be checked in the validate method
        validate();
    }

    @Override
    public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
        validate();

        oprot.writeStructBegin(STRUCT_DESC);
        if (this.message != null) {
            oprot.writeFieldBegin(MESSAGE_FIELD_DESC);
            oprot.writeString(this.message);
            oprot.writeFieldEnd();
        }
        oprot.writeFieldStop();
        oprot.writeStructEnd();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("EntitlementException(");

        sb.append("message:");
        if (this.message == null) {
            sb.append("null");
        } else {
            sb.append(this.message);
        }
        sb.append(")");
        return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
        // check for required fields
        if (message == null) {
            throw new org.apache.thrift.protocol.TProtocolException("Required field 'message' was not present! Struct: " + toString());
        }
    }

    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        try {
            write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
        } catch (org.apache.thrift.TException te) {
            throw new java.io.IOException(te);
        }
    }

    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
        try {
            read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
        } catch (org.apache.thrift.TException te) {
            throw new java.io.IOException(te);
        }
    }

    /**
     * The set of fields this struct contains, along with convenience methods for finding and manipulating them.
     */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
        MESSAGE((short) 1, EntitlementException.MESSAGE);

        private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

        static {
            for (_Fields field : EnumSet.allOf(_Fields.class)) {
                byName.put(field.getFieldName(), field);
            }
        }

        private final short thriftId;
        private final String fieldName;

        _Fields(short thriftId, String fieldName) {
            this.thriftId = thriftId;
            this.fieldName = fieldName;
        }

        /**
         * Find the _Fields constant that matches fieldId, or null if its not found.
         */
        public static _Fields findByThriftId(int fieldId) {
            if (fieldId == 1) {
                return MESSAGE;
            } else {
                return null;
            }
        }

        /**
         * Find the _Fields constant that matches fieldId, throwing an exception
         * if it is not found.
         */
        public static _Fields findByThriftIdOrThrow(int fieldId) {
            _Fields fields = findByThriftId(fieldId);
            if (fields == null) {
                throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
            }
            return fields;
        }

        /**
         * Find the _Fields constant that matches name, or null if its not found.
         */
        public static _Fields findByName(String name) {
            return byName.get(name);
        }

        @Override
        public short getThriftFieldId() {
            return thriftId;
        }

        @Override
        public String getFieldName() {
            return fieldName;
        }
    }

}


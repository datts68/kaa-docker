/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.kaaproject.kaa.common.endpoint.gen;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class UserSyncRequest extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"UserSyncRequest\",\"namespace\":\"org.kaaproject.kaa.common.endpoint.gen\",\"fields\":[{\"name\":\"userAttachRequest\",\"type\":[{\"type\":\"record\",\"name\":\"UserAttachRequest\",\"fields\":[{\"name\":\"userVerifierId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"userExternalId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"userAccessToken\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"direction\":\"out\"},\"null\"]},{\"name\":\"endpointAttachRequests\",\"type\":[{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"EndpointAttachRequest\",\"fields\":[{\"name\":\"requestId\",\"type\":\"int\"},{\"name\":\"endpointAccessToken\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"direction\":\"out\"}},\"null\"]},{\"name\":\"endpointDetachRequests\",\"type\":[{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"EndpointDetachRequest\",\"fields\":[{\"name\":\"requestId\",\"type\":\"int\"},{\"name\":\"endpointKeyHash\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"direction\":\"out\"}},\"null\"]}],\"direction\":\"out\"}");
  private org.kaaproject.kaa.common.endpoint.gen.UserAttachRequest userAttachRequest;
  private java.util.List<org.kaaproject.kaa.common.endpoint.gen.EndpointAttachRequest> endpointAttachRequests;
  private java.util.List<org.kaaproject.kaa.common.endpoint.gen.EndpointDetachRequest> endpointDetachRequests;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}.
   */
  public UserSyncRequest() {
  }

  /**
   * All-args constructor.
   */
  public UserSyncRequest(org.kaaproject.kaa.common.endpoint.gen.UserAttachRequest userAttachRequest, java.util.List<org.kaaproject.kaa.common.endpoint.gen.EndpointAttachRequest> endpointAttachRequests, java.util.List<org.kaaproject.kaa.common.endpoint.gen.EndpointDetachRequest> endpointDetachRequests) {
    this.userAttachRequest = userAttachRequest;
    this.endpointAttachRequests = endpointAttachRequests;
    this.endpointDetachRequests = endpointDetachRequests;
  }

  public static org.apache.avro.Schema getClassSchema() {
    return SCHEMA$;
  }

  /**
   * Creates a new UserSyncRequest RecordBuilder
   */
  public static org.kaaproject.kaa.common.endpoint.gen.UserSyncRequest.Builder newBuilder() {
    return new org.kaaproject.kaa.common.endpoint.gen.UserSyncRequest.Builder();
  }

  /**
   * Creates a new UserSyncRequest RecordBuilder by copying an existing Builder
   */
  public static org.kaaproject.kaa.common.endpoint.gen.UserSyncRequest.Builder newBuilder(org.kaaproject.kaa.common.endpoint.gen.UserSyncRequest.Builder other) {
    return new org.kaaproject.kaa.common.endpoint.gen.UserSyncRequest.Builder(other);
  }

  /**
   * Creates a new UserSyncRequest RecordBuilder by copying an existing UserSyncRequest instance
   */
  public static org.kaaproject.kaa.common.endpoint.gen.UserSyncRequest.Builder newBuilder(org.kaaproject.kaa.common.endpoint.gen.UserSyncRequest other) {
    return new org.kaaproject.kaa.common.endpoint.gen.UserSyncRequest.Builder(other);
  }

  public org.apache.avro.Schema getSchema() {
    return SCHEMA$;
  }

  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
      case 0:
        return userAttachRequest;
      case 1:
        return endpointAttachRequests;
      case 2:
        return endpointDetachRequests;
      default:
        throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value = "unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
      case 0:
        userAttachRequest = (org.kaaproject.kaa.common.endpoint.gen.UserAttachRequest) value$;
        break;
      case 1:
        endpointAttachRequests = (java.util.List<org.kaaproject.kaa.common.endpoint.gen.EndpointAttachRequest>) value$;
        break;
      case 2:
        endpointDetachRequests = (java.util.List<org.kaaproject.kaa.common.endpoint.gen.EndpointDetachRequest>) value$;
        break;
      default:
        throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'userAttachRequest' field.
   */
  public org.kaaproject.kaa.common.endpoint.gen.UserAttachRequest getUserAttachRequest() {
    return userAttachRequest;
  }

  /**
   * Sets the value of the 'userAttachRequest' field.
   *
   * @param value the value to set.
   */
  public void setUserAttachRequest(org.kaaproject.kaa.common.endpoint.gen.UserAttachRequest value) {
    this.userAttachRequest = value;
  }

  /**
   * Gets the value of the 'endpointAttachRequests' field.
   */
  public java.util.List<org.kaaproject.kaa.common.endpoint.gen.EndpointAttachRequest> getEndpointAttachRequests() {
    return endpointAttachRequests;
  }

  /**
   * Sets the value of the 'endpointAttachRequests' field.
   *
   * @param value the value to set.
   */
  public void setEndpointAttachRequests(java.util.List<org.kaaproject.kaa.common.endpoint.gen.EndpointAttachRequest> value) {
    this.endpointAttachRequests = value;
  }

  /**
   * Gets the value of the 'endpointDetachRequests' field.
   */
  public java.util.List<org.kaaproject.kaa.common.endpoint.gen.EndpointDetachRequest> getEndpointDetachRequests() {
    return endpointDetachRequests;
  }

  /**
   * Sets the value of the 'endpointDetachRequests' field.
   *
   * @param value the value to set.
   */
  public void setEndpointDetachRequests(java.util.List<org.kaaproject.kaa.common.endpoint.gen.EndpointDetachRequest> value) {
    this.endpointDetachRequests = value;
  }

  /**
   * RecordBuilder for UserSyncRequest instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<UserSyncRequest>
      implements org.apache.avro.data.RecordBuilder<UserSyncRequest> {

    private org.kaaproject.kaa.common.endpoint.gen.UserAttachRequest userAttachRequest;
    private java.util.List<org.kaaproject.kaa.common.endpoint.gen.EndpointAttachRequest> endpointAttachRequests;
    private java.util.List<org.kaaproject.kaa.common.endpoint.gen.EndpointDetachRequest> endpointDetachRequests;

    /**
     * Creates a new Builder
     */
    private Builder() {
      super(org.kaaproject.kaa.common.endpoint.gen.UserSyncRequest.SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder
     */
    private Builder(org.kaaproject.kaa.common.endpoint.gen.UserSyncRequest.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.userAttachRequest)) {
        this.userAttachRequest = data().deepCopy(fields()[0].schema(), other.userAttachRequest);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.endpointAttachRequests)) {
        this.endpointAttachRequests = data().deepCopy(fields()[1].schema(), other.endpointAttachRequests);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.endpointDetachRequests)) {
        this.endpointDetachRequests = data().deepCopy(fields()[2].schema(), other.endpointDetachRequests);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing UserSyncRequest instance
     */
    private Builder(org.kaaproject.kaa.common.endpoint.gen.UserSyncRequest other) {
      super(org.kaaproject.kaa.common.endpoint.gen.UserSyncRequest.SCHEMA$);
      if (isValidValue(fields()[0], other.userAttachRequest)) {
        this.userAttachRequest = data().deepCopy(fields()[0].schema(), other.userAttachRequest);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.endpointAttachRequests)) {
        this.endpointAttachRequests = data().deepCopy(fields()[1].schema(), other.endpointAttachRequests);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.endpointDetachRequests)) {
        this.endpointDetachRequests = data().deepCopy(fields()[2].schema(), other.endpointDetachRequests);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Gets the value of the 'userAttachRequest' field
     */
    public org.kaaproject.kaa.common.endpoint.gen.UserAttachRequest getUserAttachRequest() {
      return userAttachRequest;
    }

    /**
     * Sets the value of the 'userAttachRequest' field
     */
    public org.kaaproject.kaa.common.endpoint.gen.UserSyncRequest.Builder setUserAttachRequest(org.kaaproject.kaa.common.endpoint.gen.UserAttachRequest value) {
      validate(fields()[0], value);
      this.userAttachRequest = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
     * Checks whether the 'userAttachRequest' field has been set
     */
    public boolean hasUserAttachRequest() {
      return fieldSetFlags()[0];
    }

    /**
     * Clears the value of the 'userAttachRequest' field
     */
    public org.kaaproject.kaa.common.endpoint.gen.UserSyncRequest.Builder clearUserAttachRequest() {
      userAttachRequest = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
     * Gets the value of the 'endpointAttachRequests' field
     */
    public java.util.List<org.kaaproject.kaa.common.endpoint.gen.EndpointAttachRequest> getEndpointAttachRequests() {
      return endpointAttachRequests;
    }

    /**
     * Sets the value of the 'endpointAttachRequests' field
     */
    public org.kaaproject.kaa.common.endpoint.gen.UserSyncRequest.Builder setEndpointAttachRequests(java.util.List<org.kaaproject.kaa.common.endpoint.gen.EndpointAttachRequest> value) {
      validate(fields()[1], value);
      this.endpointAttachRequests = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
     * Checks whether the 'endpointAttachRequests' field has been set
     */
    public boolean hasEndpointAttachRequests() {
      return fieldSetFlags()[1];
    }

    /**
     * Clears the value of the 'endpointAttachRequests' field
     */
    public org.kaaproject.kaa.common.endpoint.gen.UserSyncRequest.Builder clearEndpointAttachRequests() {
      endpointAttachRequests = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
     * Gets the value of the 'endpointDetachRequests' field
     */
    public java.util.List<org.kaaproject.kaa.common.endpoint.gen.EndpointDetachRequest> getEndpointDetachRequests() {
      return endpointDetachRequests;
    }

    /**
     * Sets the value of the 'endpointDetachRequests' field
     */
    public org.kaaproject.kaa.common.endpoint.gen.UserSyncRequest.Builder setEndpointDetachRequests(java.util.List<org.kaaproject.kaa.common.endpoint.gen.EndpointDetachRequest> value) {
      validate(fields()[2], value);
      this.endpointDetachRequests = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
     * Checks whether the 'endpointDetachRequests' field has been set
     */
    public boolean hasEndpointDetachRequests() {
      return fieldSetFlags()[2];
    }

    /**
     * Clears the value of the 'endpointDetachRequests' field
     */
    public org.kaaproject.kaa.common.endpoint.gen.UserSyncRequest.Builder clearEndpointDetachRequests() {
      endpointDetachRequests = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public UserSyncRequest build() {
      try {
        UserSyncRequest record = new UserSyncRequest();
        record.userAttachRequest = fieldSetFlags()[0] ? this.userAttachRequest : (org.kaaproject.kaa.common.endpoint.gen.UserAttachRequest) defaultValue(fields()[0]);
        record.endpointAttachRequests = fieldSetFlags()[1] ? this.endpointAttachRequests : (java.util.List<org.kaaproject.kaa.common.endpoint.gen.EndpointAttachRequest>) defaultValue(fields()[1]);
        record.endpointDetachRequests = fieldSetFlags()[2] ? this.endpointDetachRequests : (java.util.List<org.kaaproject.kaa.common.endpoint.gen.EndpointDetachRequest>) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}

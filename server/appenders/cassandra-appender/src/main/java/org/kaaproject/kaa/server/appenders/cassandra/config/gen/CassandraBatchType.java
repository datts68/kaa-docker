/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.kaaproject.kaa.server.appenders.cassandra.config.gen;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public enum CassandraBatchType {
  LOGGED, UNLOGGED;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"enum\",\"name\":\"CassandraBatchType\",\"namespace\":\"org.kaaproject.kaa.server.appenders.cassandra.config.gen\",\"symbols\":[\"LOGGED\",\"UNLOGGED\"]}");

  public static org.apache.avro.Schema getClassSchema() {
    return SCHEMA$;
  }
}

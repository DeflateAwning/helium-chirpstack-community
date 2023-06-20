// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/internal.proto

package io.chirpstack.api;

public interface CreateApiKeyResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.CreateApiKeyResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * API key ID.
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The id.
   */
  String getId();
  /**
   * <pre>
   * API key ID.
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * API token for authentication API requests.
   * </pre>
   *
   * <code>string token = 2;</code>
   * @return The token.
   */
  String getToken();
  /**
   * <pre>
   * API token for authentication API requests.
   * </pre>
   *
   * <code>string token = 2;</code>
   * @return The bytes for token.
   */
  com.google.protobuf.ByteString
      getTokenBytes();
}

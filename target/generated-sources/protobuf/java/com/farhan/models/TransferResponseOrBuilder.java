// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: transfer-service.proto

package com.farhan.models;

public interface TransferResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:TransferResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.TransferStatus status = 1;</code>
   */
  int getStatusValue();
  /**
   * <code>.TransferStatus status = 1;</code>
   */
  com.farhan.models.TransferStatus getStatus();

  /**
   * <code>repeated .Account accounts = 2;</code>
   */
  java.util.List<com.farhan.models.Account> 
      getAccountsList();
  /**
   * <code>repeated .Account accounts = 2;</code>
   */
  com.farhan.models.Account getAccounts(int index);
  /**
   * <code>repeated .Account accounts = 2;</code>
   */
  int getAccountsCount();
  /**
   * <code>repeated .Account accounts = 2;</code>
   */
  java.util.List<? extends com.farhan.models.AccountOrBuilder> 
      getAccountsOrBuilderList();
  /**
   * <code>repeated .Account accounts = 2;</code>
   */
  com.farhan.models.AccountOrBuilder getAccountsOrBuilder(
      int index);
}

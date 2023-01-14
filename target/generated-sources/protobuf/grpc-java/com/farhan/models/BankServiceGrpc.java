package com.farhan.models;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.1)",
    comments = "Source: bank-service.proto")
public final class BankServiceGrpc {

  private BankServiceGrpc() {}

  public static final String SERVICE_NAME = "BankService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.farhan.models.BankCheckRequest,
      com.farhan.models.Balance> getGetBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getBalance",
      requestType = com.farhan.models.BankCheckRequest.class,
      responseType = com.farhan.models.Balance.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.farhan.models.BankCheckRequest,
      com.farhan.models.Balance> getGetBalanceMethod() {
    io.grpc.MethodDescriptor<com.farhan.models.BankCheckRequest, com.farhan.models.Balance> getGetBalanceMethod;
    if ((getGetBalanceMethod = BankServiceGrpc.getGetBalanceMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getGetBalanceMethod = BankServiceGrpc.getGetBalanceMethod) == null) {
          BankServiceGrpc.getGetBalanceMethod = getGetBalanceMethod = 
              io.grpc.MethodDescriptor.<com.farhan.models.BankCheckRequest, com.farhan.models.Balance>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "getBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.farhan.models.BankCheckRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.farhan.models.Balance.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("getBalance"))
                  .build();
          }
        }
     }
     return getGetBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.farhan.models.WithdrawRequest,
      com.farhan.models.Money> getGetWithdrawMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getWithdraw",
      requestType = com.farhan.models.WithdrawRequest.class,
      responseType = com.farhan.models.Money.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.farhan.models.WithdrawRequest,
      com.farhan.models.Money> getGetWithdrawMethod() {
    io.grpc.MethodDescriptor<com.farhan.models.WithdrawRequest, com.farhan.models.Money> getGetWithdrawMethod;
    if ((getGetWithdrawMethod = BankServiceGrpc.getGetWithdrawMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getGetWithdrawMethod = BankServiceGrpc.getGetWithdrawMethod) == null) {
          BankServiceGrpc.getGetWithdrawMethod = getGetWithdrawMethod = 
              io.grpc.MethodDescriptor.<com.farhan.models.WithdrawRequest, com.farhan.models.Money>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "getWithdraw"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.farhan.models.WithdrawRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.farhan.models.Money.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("getWithdraw"))
                  .build();
          }
        }
     }
     return getGetWithdrawMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.farhan.models.DepositRequest,
      com.farhan.models.Balance> getCashDepositMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "cashDeposit",
      requestType = com.farhan.models.DepositRequest.class,
      responseType = com.farhan.models.Balance.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.farhan.models.DepositRequest,
      com.farhan.models.Balance> getCashDepositMethod() {
    io.grpc.MethodDescriptor<com.farhan.models.DepositRequest, com.farhan.models.Balance> getCashDepositMethod;
    if ((getCashDepositMethod = BankServiceGrpc.getCashDepositMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getCashDepositMethod = BankServiceGrpc.getCashDepositMethod) == null) {
          BankServiceGrpc.getCashDepositMethod = getCashDepositMethod = 
              io.grpc.MethodDescriptor.<com.farhan.models.DepositRequest, com.farhan.models.Balance>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "cashDeposit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.farhan.models.DepositRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.farhan.models.Balance.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("cashDeposit"))
                  .build();
          }
        }
     }
     return getCashDepositMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BankServiceStub newStub(io.grpc.Channel channel) {
    return new BankServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BankServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BankServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BankServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BankServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class BankServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *  Unary
     * </pre>
     */
    public void getBalance(com.farhan.models.BankCheckRequest request,
        io.grpc.stub.StreamObserver<com.farhan.models.Balance> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBalanceMethod(), responseObserver);
    }

    /**
     * <pre>
     *Server Side Streaming
     * </pre>
     */
    public void getWithdraw(com.farhan.models.WithdrawRequest request,
        io.grpc.stub.StreamObserver<com.farhan.models.Money> responseObserver) {
      asyncUnimplementedUnaryCall(getGetWithdrawMethod(), responseObserver);
    }

    /**
     * <pre>
     *  Client Side Streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.farhan.models.DepositRequest> cashDeposit(
        io.grpc.stub.StreamObserver<com.farhan.models.Balance> responseObserver) {
      return asyncUnimplementedStreamingCall(getCashDepositMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetBalanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.farhan.models.BankCheckRequest,
                com.farhan.models.Balance>(
                  this, METHODID_GET_BALANCE)))
          .addMethod(
            getGetWithdrawMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.farhan.models.WithdrawRequest,
                com.farhan.models.Money>(
                  this, METHODID_GET_WITHDRAW)))
          .addMethod(
            getCashDepositMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.farhan.models.DepositRequest,
                com.farhan.models.Balance>(
                  this, METHODID_CASH_DEPOSIT)))
          .build();
    }
  }

  /**
   */
  public static final class BankServiceStub extends io.grpc.stub.AbstractStub<BankServiceStub> {
    private BankServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BankServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BankServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *  Unary
     * </pre>
     */
    public void getBalance(com.farhan.models.BankCheckRequest request,
        io.grpc.stub.StreamObserver<com.farhan.models.Balance> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Server Side Streaming
     * </pre>
     */
    public void getWithdraw(com.farhan.models.WithdrawRequest request,
        io.grpc.stub.StreamObserver<com.farhan.models.Money> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetWithdrawMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *  Client Side Streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.farhan.models.DepositRequest> cashDeposit(
        io.grpc.stub.StreamObserver<com.farhan.models.Balance> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getCashDepositMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class BankServiceBlockingStub extends io.grpc.stub.AbstractStub<BankServiceBlockingStub> {
    private BankServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BankServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BankServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *  Unary
     * </pre>
     */
    public com.farhan.models.Balance getBalance(com.farhan.models.BankCheckRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBalanceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Server Side Streaming
     * </pre>
     */
    public java.util.Iterator<com.farhan.models.Money> getWithdraw(
        com.farhan.models.WithdrawRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetWithdrawMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BankServiceFutureStub extends io.grpc.stub.AbstractStub<BankServiceFutureStub> {
    private BankServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BankServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BankServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *  Unary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.farhan.models.Balance> getBalance(
        com.farhan.models.BankCheckRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBalanceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_BALANCE = 0;
  private static final int METHODID_GET_WITHDRAW = 1;
  private static final int METHODID_CASH_DEPOSIT = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BankServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BankServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_BALANCE:
          serviceImpl.getBalance((com.farhan.models.BankCheckRequest) request,
              (io.grpc.stub.StreamObserver<com.farhan.models.Balance>) responseObserver);
          break;
        case METHODID_GET_WITHDRAW:
          serviceImpl.getWithdraw((com.farhan.models.WithdrawRequest) request,
              (io.grpc.stub.StreamObserver<com.farhan.models.Money>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CASH_DEPOSIT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.cashDeposit(
              (io.grpc.stub.StreamObserver<com.farhan.models.Balance>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class BankServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BankServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.farhan.models.BankServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BankService");
    }
  }

  private static final class BankServiceFileDescriptorSupplier
      extends BankServiceBaseDescriptorSupplier {
    BankServiceFileDescriptorSupplier() {}
  }

  private static final class BankServiceMethodDescriptorSupplier
      extends BankServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BankServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (BankServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BankServiceFileDescriptorSupplier())
              .addMethod(getGetBalanceMethod())
              .addMethod(getGetWithdrawMethod())
              .addMethod(getCashDepositMethod())
              .build();
        }
      }
    }
    return result;
  }
}

package org.example.server;

import com.farhan.models.TransferRequest;
import com.farhan.models.TransferResponse;
import com.farhan.models.TransferServiceGrpc;
import io.grpc.stub.StreamObserver;
import org.example.tranferstream.TransferStreamRequest;

public class TransferService extends TransferServiceGrpc.TransferServiceImplBase {
    @Override
    public StreamObserver<TransferRequest> transfer(StreamObserver<TransferResponse> responseObserver) {
        return new TransferStreamRequest(responseObserver);
    }
}

package org.example;

import com.azure.storage.blob.BlobServiceClient;
import com.azure.storage.blob.BlobServiceClientBuilder;

public class Main {

    public static void main(String[] args) {

        BlobServiceClient blobServiceClient = new BlobServiceClientBuilder()
                .endpoint("https://trasktest.blob.core.windows.net/")
                .connectionString(System.getenv("AZURE_BLOB_CONNECTION_STRING"))
                .buildClient();

        System.out.println(blobServiceClient.getProperties());
//
//        for (BlobContainerItem item : blobServiceClient.listBlobContainers()) {
//            System.out.println(item.getName());
//        }
    }
}

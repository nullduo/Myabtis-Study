package com.es.test;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.indices.CreateIndexRequest;
import org.elasticsearch.client.indices.CreateIndexResponse;
import org.elasticsearch.client.indices.GetIndexRequest;
import org.elasticsearch.client.indices.GetIndexResponse;

public class ESTest_Client {
    public static void main(String[] args) throws  Exception{
        //创建ES客户端
        RestHighLevelClient esClient = new RestHighLevelClient(
                RestClient.builder(new HttpHost("localhost",9200,"http"))
        );
        //创建索引
        CreateIndexRequest request =  new CreateIndexRequest("user");
        CreateIndexResponse createIndexResponse = esClient.indices().create(request, RequestOptions.DEFAULT);
        //响应状态
        Boolean acknowledged =  createIndexResponse.isAcknowledged();
        //IDEA输出快捷键 syou
        System.out.print("索引状态"+acknowledged);

        //查询索引
        GetIndexRequest getindexRequest = new GetIndexRequest("user");
        GetIndexResponse getIndexResponse = esClient.indices().get(getindexRequest,RequestOptions.DEFAULT);
        System.out.println(getIndexResponse.getAliases());
        //关闭ES客户端
        esClient.close();
    }
}

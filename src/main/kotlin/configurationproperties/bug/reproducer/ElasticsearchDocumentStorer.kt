package configurationproperties.bug.reproducer

import io.vertx.core.json.JsonObject
import javax.inject.Singleton

@Singleton
class ElasticsearchDocumentStorer(private val elasticConfiguration: ElasticConfiguration) {

    private val indexPrefix = elasticConfiguration.indexPrefix

    fun storeDocument(index: String, document: JsonObject) {
        println(System.getenv().map { "${it.key}=${it.value}" }.joinToString("\n"))
        println()
        println("${indexPrefix}-$index")
        println("${elasticConfiguration.indexPrefix}-$index")
    }

}
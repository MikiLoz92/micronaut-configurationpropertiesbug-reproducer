package configurationproperties.bug.reproducer

import io.vertx.core.Vertx
import io.vertx.kotlin.core.json.jsonObjectOf
import javax.inject.Singleton

@Singleton
class FleetSessionStatusPeriodicNotifier(
        private val vertx: Vertx,
        private val elasticsearchDocumentStorer: ElasticsearchDocumentStorer
) {

    fun start() {
        vertx.setPeriodic(5_000) {
                elasticsearchDocumentStorer.storeDocument("indexname", jsonObjectOf())
        }
    }

}
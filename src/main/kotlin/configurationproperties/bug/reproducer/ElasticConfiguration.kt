package configurationproperties.bug.reproducer

import io.micronaut.context.annotation.ConfigurationProperties

@ConfigurationProperties("elastic")
interface ElasticConfiguration {
    val indexPrefix: String
}
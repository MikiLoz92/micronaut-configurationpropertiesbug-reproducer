package configurationproperties.bug.reproducer

import io.micronaut.context.annotation.Factory
import io.vertx.core.Vertx
import javax.inject.Singleton

@Factory
class ApplicationDependenciesFactory {

    @Singleton
    fun provideVertx(): Vertx = Vertx.vertx()

}
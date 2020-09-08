package ch.srf

import io.micronaut.configuration.jdbc.hikari.DatasourceConfiguration
import io.micronaut.configuration.jdbc.hikari.DatasourceFactory
import io.micronaut.context.ApplicationContext
import io.micronaut.context.annotation.Context
import io.micronaut.context.annotation.EachBean
import io.micronaut.context.annotation.Replaces
import javax.annotation.PreDestroy
import javax.sql.DataSource

@Replaces(DatasourceFactory::class)
class CustomDataSourceFactory(
        applicationContext: ApplicationContext
) : DatasourceFactory(applicationContext) {


    @Context
    @EachBean(DatasourceConfiguration::class)
    override fun dataSource(datasourceConfiguration: DatasourceConfiguration?): DataSource? {
        println("Replaces works!")
        return super.dataSource(datasourceConfiguration)
    }

    @Override
    @PreDestroy
    override fun close() {
        super.close()
    }
}
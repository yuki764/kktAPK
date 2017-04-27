package com.bl_lia.kirakiratter.data.repository

import com.bl_lia.kirakiratter.data.repository.datasource.timeline.TimelineDataStoreFactory
import com.bl_lia.kirakiratter.domain.entity.Status
import com.bl_lia.kirakiratter.domain.repository.TimelineRepository
import io.reactivex.Single
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class TimelineDataRepository
    @Inject constructor(
            private val timelineDataStoreFactory: TimelineDataStoreFactory
    ): TimelineRepository {

    override fun homeTimeline(): Single<List<Status>> =
            timelineDataStoreFactory.create().homeTimeline()

    override fun moreHomeTimeline(maxId: String?, sinceId: String?): Single<List<Status>> =
            timelineDataStoreFactory.create().moreHomeTimeline(maxId, sinceId)

    override fun publicTimeline(): Single<List<Status>> =
            timelineDataStoreFactory.create().publicTimeline()

    override fun morePublicTimeline(maxId: String?, sinceId: String?): Single<List<Status>> =
            timelineDataStoreFactory.create().morePublicTimeline(maxId, sinceId)

    override fun favourite(id: String): Single<Status> =
            timelineDataStoreFactory.create().favourite(id)

    override fun unfavourite(id: String): Single<Status> =
            timelineDataStoreFactory.create().favourite(id)

    override fun reblog(id: Int): Single<Status> =
            timelineDataStoreFactory.create().reblog(id)

    override fun unReblog(id: Int): Single<Status> =
            timelineDataStoreFactory.create().unReblog(id)
}
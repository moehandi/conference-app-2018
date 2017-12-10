package io.github.droidkaigi.confsched2018.data.repository

import android.support.annotation.CheckResult
import io.github.droidkaigi.confsched2018.model.Session
import io.reactivex.Completable
import io.reactivex.Flowable

interface SessionRepository {
    val sessions: Flowable<List<Session>>

    @CheckResult
    fun refreshSessions(): Completable
}
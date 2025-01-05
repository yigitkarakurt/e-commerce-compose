package com.yigitkarakurt.e_commerce_compose.data.repository

import com.yigitkarakurt.e_commerce_compose.data.source.local.MainRoomDB
import com.yigitkarakurt.e_commerce_compose.data.source.remote.MainService
import com.yigitkarakurt.e_commerce_compose.domain.repository.MainRepository
import javax.inject.Inject

class MainRepositoryImpl @Inject constructor(
    private val mainService: MainService,
    private val mainRoomDB: MainRoomDB,
) : MainRepository
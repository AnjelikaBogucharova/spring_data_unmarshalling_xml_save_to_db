package com.anjelikabog.spring_data_unmarshalling_xml_save_to_db.repo

import com.anjelikabog.spring_data_unmarshalling_xml_save_to_db.modelDataBase.*
import org.springframework.stereotype.Repository
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import java.util.*


@Repository
interface PersonsRepository : JpaRepository<PersonsDB, Long> {

}

@Repository
interface HobbyRepository : JpaRepository<HobbyDB, Long>{

}

@Repository
interface HobbiesRepository : JpaRepository<HobbiesDB, Long>{

}
package com.anjelikabog.spring_data_unmarshalling_xml_save_to_db.modelDataBase


import java.io.Serializable
import java.sql.Date
import javax.persistence.*


@Entity
@Table(name = "persons")
data class PersonsDB(
        @Id
        @SequenceGenerator(name = "person_id_seq", sequenceName = "persons_id_seq", allocationSize = 1)
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "person_id_seq")
        @Column(name = "id", nullable = false, insertable = false)
        val idPersons: Long? = null,

        @Column(nullable = false)
        val fullname: String? = null,

        @Column(nullable = false)
        val birthday: Date? = null
)

@Entity
@Table(name = "hobby")
data class HobbyDB(
        @Id
        @SequenceGenerator(name = "hob_id_seq", sequenceName = "hobby_id_seq", allocationSize = 1)
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hob_id_seq")
        @Column(name = "id", nullable = false, insertable = false)
        val idHobby: Long? = null,

        @Column(nullable = false)
        val complexity: Int? = null,

        @Column(name = "hobby_name", nullable = false)
        val hobbyName: String? = null

)



class HobbiesId:Serializable{
        var idPersons: Long? = null
        var idHobby: Long? = null
}

@Entity
@Table(name = "hobbies")
@IdClass(HobbiesId::class)
data class HobbiesDB(
        @Id
        @Column(name = "id_persons")
        var idPersons: Long? = null,
        @Id
        @Column(name = "id_hobby")
        var idHobby: Long? = null

)





package io.github.dzulfikar68.realmadridsquad24_25

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

val listPlayer = listOf(
    Player(
        name = "Vinicius Junior",
        imageUrl = "https://thesun.my/binrepository/gnkuhouwiaixefa_4230398_20240531094248.jpg",
        birthDate = "Jul 12, 2000",
        age = 24,
        height = 1.76,
        national = "Brazil",
        number = 7,
        role = "Forward",
        position = "Attack - Left Winger",
        foot = "Right",
        joinDate = "Jul 12, 2018",
        expiredDate = "Jun 30, 2027",
        website = "https://www.realmadrid.com/en-US/football/first-team/players/vinicius-paixao-de-oliveira-junior",
        rawHtmlDescription = R.raw.vini7
    ),
    Player(
        name = "Federico Valverde",
        imageUrl = "https://www.ligaolahraga.com/storage/images/news/2023/11/10/fede-valverde-akhirnya-resmi-perpanjang-kontrak-dengan-real-madrid.jpg",
        birthDate = "Jul 22, 1998",
        age = 26,
        height = 1.82,
        national = "Uruguay",
        number = 8,
        role = "Midfielder",
        position = "Midfield - Central Midfield",
        foot = "Right",
        joinDate = "Jul 1, 2018",
        expiredDate = "Jun 30, 2029",
        website = "https://www.realmadrid.com/en-US/football/first-team/players/federico-santiago-valverde-dipetta",
        rawHtmlDescription = R.raw.valverde8
    ),
    Player(
        name = "Kylian Mbappé",
        imageUrl = "https://i2-prod.mirror.co.uk/incoming/article33587515.ece/ALTERNATES/n615/0_GettyImages-2169788958.jpg",
        birthDate = "Dec 20, 1998",
        age = 25,
        height = 1.78,
        national = "France",
        number = 9,
        role = "Forward",
        position = "Attack - Centre-Forward",
        foot = "Right",
        joinDate = "Jul 1, 2024",
        expiredDate = "Jun 30, 2029",
        website = "https://www.realmadrid.com/en-US/football/first-team/players/kylian-mbappe",
        rawHtmlDescription = R.raw.mbappe9
    ),
    Player(
        name = "Rodrygo",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSw2v652b1W2lwDjV2Y9JBrWdXDiL2FU92RDA&s",
        birthDate = "Jan 9, 2001",
        age = 23,
        height = 1.74,
        national = "Brazil",
        number = 11,
        role = "Forward",
        position = "Attack - Right Winger",
        foot = "Right",
        joinDate = "Jul 1, 2019",
        expiredDate = "Jun 30, 2028",
        website = "https://www.realmadrid.com/en-US/football/first-team/players/rodrygo-goes",
        rawHtmlDescription = R.raw.rodrygo11
    ),
    Player(
        name = "Endrick",
        imageUrl = "https://img.antaranews.com/cache/730x487/2024/07/27/000_36689RB.jpg",
        birthDate = "Jul 21, 2006",
        age = 18,
        height = 1.73,
        national = "Brazil",
        number = 16,
        role = "Forward",
        position = "Attack - Centre-Forward",
        foot = "Left",
        joinDate = "Jul 21, 2024",
        expiredDate = "Jun 30, 2030",
        website = "https://www.realmadrid.com/en-US/football/first-team/players/endrick-felipe-moreira-de-sousa",
        rawHtmlDescription = R.raw.endrick16
    ),
    Player(
        name = "Brahim Díaz",
        imageUrl = "https://akcdn.detik.net.id/community/media/visual/2023/12/18/brahim-diaz.jpeg?w=600&q=90",
        birthDate = "Aug 3, 1999",
        age = 25,
        height = 1.70,
        national = "Morocco",
        number = 21,
        role = "Forward",
        position = "Midfield - Attacking Midfield",
        foot = "Both",
        joinDate = "Jan 6, 2019",
        expiredDate = "Jun 30, 2027",
        website = "https://www.realmadrid.com/en-US/football/first-team/players/brahim-diaz",
        rawHtmlDescription = R.raw.brahim21
    ),
    Player(
        name = "Jude Bellingham",
        imageUrl = "https://www.ligaolahraga.com/storage/images/news/2024/05/08/jude-bellingham-nikmati-musim-pertamanya-bersama-real-madrid.jpg",
        birthDate = "Jun 29, 2003",
        age = 21,
        height = 1.86,
        national = "England",
        number = 5,
        role = "Midfielder",
        position = "Midfield - Attacking Midfield",
        foot = "Right",
        joinDate = "Jul 1, 2023",
        expiredDate = "Jun 30, 2029",
        website = "https://www.realmadrid.com/en-US/football/first-team/players/jude-bellingham",
        rawHtmlDescription = R.raw.bellingham5
    ),
    Player(
        name = "Eduardo Camavinga",
        imageUrl = "https://www.planetsport.com/image-library/land/700/e/eduardo-camavinga-real-madrid-may22-2.webp",
        birthDate = "Nov 10, 2002",
        age = 21,
        height = 1.82,
        national = "France",
        number = 6,
        role = "Midfielder",
        position = "Midfield - Central Midfield",
        foot = "Left",
        joinDate = "Aug 31, 2021",
        expiredDate = "Jun 30, 2029",
        website = "https://www.realmadrid.com/en-US/football/first-team/players/eduardo-camavinga",
        rawHtmlDescription = R.raw.camavinga6
    ),
    Player(
        name = "Luka Modric",
        imageUrl = "https://www.jurnas.com/images/posts/1/2024/2024-05-12/87997e535177e079fee664665d9ef036_1.jpg",
        birthDate = "Sep 9, 1985",
        age = 21,
        height = 1.72,
        national = "Croatia",
        number = 10,
        role = "Midfielder",
        position = "Midfield - Central Midfield",
        foot = "Right",
        joinDate = "Aug 27, 2012",
        expiredDate = "Jun 30, 2025",
        website = "https://www.realmadrid.com/en-US/football/first-team/players/luka-modric",
        rawHtmlDescription = R.raw.modric10
    ),
    Player(
        name = "Aurélien Tchouaméni",
        imageUrl = "https://i2-prod.liverpoolecho.co.uk/incoming/article27519389.ece/ALTERNATES/s615/0_GettyImages-1595469336.jpg",
        birthDate = "Jan 27, 2000",
        age = 24,
        height = 1.88,
        national = "France",
        number = 14,
        role = "Midfielder",
        position = "Midfield - Defensive Midfield",
        foot = "Right",
        joinDate = "Jul 1, 2022",
        expiredDate = "Jun 30, 2028",
        website = "https://www.realmadrid.com/en-US/football/first-team/players/aurelien-tchouameni",
        rawHtmlDescription = R.raw.tchouameni14
    ),
    Player(
        name = "Arda Güler",
        imageUrl = "https://static.promediateknologi.id/crop/0x0:0x0/0x0/webp/photo/p2/25/2024/05/15/Arda-guler-kembali-cetak-gol-keempat-1851706995.jpg",
        birthDate = "Feb 25, 2005",
        age = 19,
        height = 1.75,
        national = "Türkiye",
        number = 15,
        role = "Midfielder",
        position = "Attack - Right Winger",
        foot = "Left",
        joinDate = "Jul 6, 2023",
        expiredDate = "Jun 30, 2029",
        website = "https://www.realmadrid.com/en-US/football/first-team/players/arda-guler",
        rawHtmlDescription = R.raw.arda15
    ),
    Player(
        name = "Dani Ceballos",
        imageUrl = "https://media.vivagoal.com/2023/03/1247269334.jpeg",
        birthDate = "Aug 7, 1996",
        age = 28,
        height = 1.79,
        national = "Spain",
        number = 19,
        role = "Midfielder",
        position = "Midfield - Central Midfield",
        foot = "Right",
        joinDate = "Jul 14, 2017",
        expiredDate = "Jun 30, 2027",
        website = "https://www.realmadrid.com/en-US/football/first-team/players/daniel-ceballos-fernandez",
        rawHtmlDescription = R.raw.ceballos19
    ),
    Player(
        name = "Daniel Carvajal",
        imageUrl = "https://assets-cms.thescore.com/uploads/image/file/592345/w640xh480_GettyImages-1689357810.jpg?ts=1695130774",
        birthDate = "Jan 11, 1992",
        age = 32,
        height = 1.73,
        national = "Spain",
        number = 2,
        role = "Defender",
        position = "Defender - Right-Back",
        foot = "Right",
        joinDate = "Jul 1, 2013",
        expiredDate = "Jun 30, 2025",
        website = "https://www.realmadrid.com/en-US/football/first-team/players/daniel-carvajal-ramos",
        rawHtmlDescription = R.raw.carvajal2
    ),
    Player(
        name = "Éder Militão",
        imageUrl = "https://e00-marca.uecdn.es/assets/multimedia/imagenes/2019/08/03/15648612103195.jpg",
        birthDate = "Jan 18, 1998",
        age = 26,
        height = 1.86,
        national = "Brazil",
        number = 3,
        role = "Defender",
        position = "Defender - Centre-Back",
        foot = "Right",
        joinDate = "Jul 1, 2019",
        expiredDate = "Jun 30, 2028",
        website = "https://www.realmadrid.com/en-US/football/first-team/players/eder-gabriel-militao",
        rawHtmlDescription = R.raw.militao3
    ),
    Player(
        name = "David Alaba",
        imageUrl = "https://cdns.klimg.com/bola.net/resized/810x540/library/upload/21/2023/05/996x664/david-alaba_0869c9f.jpg",
        birthDate = "Jun 24, 1992",
        age = 32,
        height = 1.80,
        national = "Austria",
        number = 4,
        role = "Defender",
        position = "Defender - Centre-Back",
        foot = "Left",
        joinDate = "Jul 1, 2021",
        expiredDate = "Jun 30, 2026",
        website = "https://www.realmadrid.com/en-US/football/first-team/players/david-alaba",
        rawHtmlDescription = R.raw.alaba4
    ),
    Player(
        name = "Lucas Vázquez",
        imageUrl = "https://media.vivagoal.com/2024/04/lucas-vazquez-Twitter-DeadlieDayLive.jpg",
        birthDate = "Jul 1, 1991",
        age = 33,
        height = 1.73,
        national = "Spain",
        number = 17,
        role = "Defender",
        position = "Defender - Right-Back",
        foot = "Right",
        joinDate = "Jul 2, 2015",
        expiredDate = "Jun 30, 2025",
        website = "https://www.realmadrid.com/en-US/football/first-team/players/lucas-vazquez-iglesias",
        rawHtmlDescription = R.raw.vazquez17
    ),
    Player(
        name = "Jesús Vallejo",
        imageUrl = "https://e00-marca.uecdn.es/assets/multimedia/imagenes/2019/07/27/15642261125588.jpg",
        birthDate = "Jan 5, 1997",
        age = 27,
        height = 1.84,
        national = "Spain",
        number = 18,
        role = "Defender",
        position = "Defender - Centre-Back",
        foot = "Right",
        joinDate = "Jul 31, 2015",
        expiredDate = "Jun 30, 2025",
        website = "https://www.realmadrid.com/en-US/football/first-team/players/jesus-vallejo-lazaro",
        rawHtmlDescription = R.raw.vallejo18
    ),
    Player(
        name = "Fran García",
        imageUrl = "https://img.allfootballapp.com/www/M00/51/6B/720x-/-/-/CgAGVmaGf1GAJnV_AAF30bz9Kpw389.jpg.webp",
        birthDate = "Aug 14, 1999",
        age = 25,
        height = 1.69,
        national = "Spain",
        number = 20,
        role = "Defender",
        position = "Defender - Left-Back",
        foot = "Left",
        joinDate = "Jul 1, 2023",
        expiredDate = "Jun 30, 2027",
        website = "https://www.realmadrid.com/en-US/football/first-team/players/francisco-jose-garcia-torres",
        rawHtmlDescription = R.raw.garcia20
    ),
    Player(
        name = "Antonio Rüdiger",
        imageUrl = "https://i.dailymail.co.uk/1s/2022/09/05/17/62080081-11182261-image-a-20_1662396500786.jpg",
        birthDate = "Mar 3, 1993",
        age = 31,
        height = 1.90,
        national = "Germany",
        number = 22,
        role = "Defender",
        position = "Defender - Centre-Back",
        foot = "Right",
        joinDate = "Jul 1, 2022",
        expiredDate = "Jun 30, 2026",
        website = "https://www.realmadrid.com/en-US/football/first-team/players/antonio-rudiger",
        rawHtmlDescription = R.raw.rudiger22
    ),
    Player(
        name = "Ferland Mendy",
        imageUrl = "https://www.ligaolahraga.com/storage/images/news/2024/01/25/ferland-mendy-tidak-berniat-meninggalkan-real-madrid.jpg",
        birthDate = "Jun 8, 1995",
        age = 29,
        height = 1.80,
        national = "France",
        number = 23,
        role = "Defender",
        position = "Defender - Left-Back",
        foot = "Left",
        joinDate = "Jul 1, 2019",
        expiredDate = "Jun 30, 2025",
        website = "https://www.realmadrid.com/en-US/football/first-team/players/ferland-mendy",
        rawHtmlDescription = R.raw.mendy23
    ),
    Player(
        name = "Thibaut Courtois",
        imageUrl = "https://akcdn.detik.net.id/community/media/visual/2023/04/19/thibaut-courtois_169.jpeg?w=600&q=90",
        birthDate = "May 11, 1992",
        age = 32,
        height = 2.00,
        national = "Belgium",
        number = 1,
        role = "Goalkeeper",
        position = "Goalkeeper",
        foot = "Left",
        joinDate = "Aug 9, 2018",
        expiredDate = "Jun 30, 2026",
        website = "https://www.realmadrid.com/en-US/football/first-team/players/thibaut-courtois",
        rawHtmlDescription = R.raw.coutois1
    ),
    Player(
        name = "Andriy Lunin",
        imageUrl = "https://static.promediateknologi.id/crop/0x0:0x0/750x500/webp/photo/p1/1028/2024/05/29/Andriy-2924458492.jpg",
        birthDate = "Feb 11, 1999",
        age = 25,
        height = 1.91,
        national = "Ukraine",
        number = 13,
        role = "Goalkeeper",
        position = "Goalkeeper",
        foot = "Right",
        joinDate = "Jul 1, 2018",
        expiredDate = "Jun 30, 2030",
        website = "https://www.realmadrid.com/en-US/football/first-team/players/andriy-lunin",
        rawHtmlDescription = R.raw.lunin13
    ),
)

@Parcelize
data class Player(
    val name: String,
    val imageUrl: String,
    val birthDate: String,
    val age: Int,
    val height: Double,
    val national: String,
    val number: Int,
    val role: String,
    val position: String,
    val foot: String,
    val joinDate: String,
    val expiredDate: String,
    val website: String,
    val rawHtmlDescription: Int,
): Parcelable
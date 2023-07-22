package com.hibit2.hibit2.profile.domain;


public enum AddressDistinct {

    SEOUL_JONGRO("서울특별시", "110", "종로구"),
    SEOUL_JUNG("서울특별시", "140", "중구"),
    SEOUL_YONGSAN("서울특별시", "170", "용산구"),
    SEOUL_SEONGDONG("서울특별시", "200", "성동구"),
    SEOUL_GWANGJIN("서울특별시", "215", "광진구"),
    SEOUL_DONGDAEMUN("서울특별시", "230", "동대문구"),
    SEOUL_JUNGNANG("서울특별시", "260", "중랑구"),
    SEOUL_SEONGBUK("서울특별시", "290", "성북구"),
    SEOUL_GANGBUK("서울특별시", "305", "강북구"),
    SEOUL_DOBONG("서울특별시", "320", "도봉구"),
    SEOUL_NOWON("서울특별시", "350", "노원구"),
    SEOUL_EUNPYEONG("서울특별시", "380", "은평구"),
    SEOUL_SEODAEMUN("서울특별시", "410", "서대문구"),
    SEOUL_MAPO("서울특별시", "440", "마포구"),
    SEOUL_YANGCHEON("서울특별시", "470", "양천구"),
    SEOUL_GANGSEO("서울특별시", "500", "강서구"),
    SEOUL_GURO("서울특별시", "530", "구로구"),
    SEOUL_GEUMCHEON("서울특별시", "545", "금천구"),
    SEOUL_YEONGDEUNGPO("서울특별시", "560", "영등포구"),
    SEOUL_DONGJAK("서울특별시", "590", "동작구"),
    SEOUL_GWANAK("서울특별시", "620", "관악구"),
    SEOUL_SEOCHO("서울특별시", "650", "서초구"),
    SEOUL_GANGNAM("서울특별시", "680", "강남구"),
    SEOUL_SONGPA("서울특별시", "710", "송파구"),
    SEOUL_GANGDONG("서울특별시", "740", "강동구"),

    BUSAN_JUNG("부산광역시", "110", "중구"),
    BUSAN_SEO("부산광역시", "140", "서구"),
    BUSAN_DONG("부산광역시", "170", "동구"),
    BUSAN_YEONGDO("부산광역시", "200", "영도구"),
    BUSAN_BUJIN("부산광역시", "230", "부산진구"),
    BUSAN_DONGLAE("부산광역시", "260", "동래구"),
    BUSAN_NAM("부산광역시", "290", "남구"),
    BUSAN_BUK("부산광역시", "320", "북구"),
    BUSAN_HAEUNDAE("부산광역시", "350", "해운대구"),
    BUSAN_SAHAGU("부산광역시", "380", "사하구"),
    BUSAN_GEUMJEONG("부산광역시", "410", "금정구"),
    BUSAN_GANGSEO("부산광역시", "440", "강서구"),
    BUSAN_YEONJE("부산광역시", "470", "연제구"),
    BUSAN_SUYEONG("부산광역시", "500", "수영구"),
    BUSAN_SASANG("부산광역시", "530", "사상구"),
    BUSAN_GIJANG("부산광역시", "710", "기장군"),

    DAEGU_JUNG("대구광역시", "110", "중구"),
    DAEGU_DONG("대구광역시", "140", "동구"),
    DAEGU_SEO("대구광역시", "170", "서구"),
    DAEGU_NAM("대구광역시", "200", "남구"),
    DAEGU_BUK("대구광역시", "230", "북구"),
    DAEGU_SUSEONG("대구광역시", "260", "수성구"),
    DAEGU_DALSEO("대구광역시", "290", "달서구"),
    DAEGU_DALSEONG("대구광역시", "710", "달성군"),

    INCHON_JUNG("인천광역시", "110", "중구"),
    INCHON_JUNG_YOUNGJONG("인천광역시", "114", "중구영종출장소"),
    INCHON_JUNG_YONGYU("인천광역시", "118", "중구용유출장소"),
    INCHON_DONG("인천광역시", "140", "동구"),
    INCHON_MICHUHOL("인천광역시", "177", "미추홀구"),
    INCHON_YEONSU("인천광역시", "185", "연수구"),
    INCHON_NAMDONG("인천광역시", "200", "남동구"),
    INCHON_BUPEONG("인천광역시", "237", "부평구"),
    INCHON_GYEGYANG("인천광역시", "245", "계양구"),
    INCHON_SEO("인천광역시", "260", "서구"),
    INCHON_SEO_GEOMDAN("인천광역시", "265", "서구검단출장"),
    INCHON_GANGHWA("인천광역시", "710", "강화군"),
    INCHON_ONGJIN("인천광역시", "720", "옹진군"),
    GWANGJU_DONG("광주광역시", "110", "동구"),
    GWANGJU_SEO("광주광역시", "140", "서구"),
    GWANGJU_NAM("광주광역시", "155", "남구"),
    GWANGJU_BUK("광주광역시", "170", "북구"),
    GWANGJU_GWANGSAN("광주광역시", "200", "광산구"),
    DAEJEON_DONG("대전광역시", "110", "동구"),
    DAEJEON_JUNG("대전광역시", "140", "중구"),
    DAEJEON_SEO("대전광역시", "170", "서구"),
    DAEJEON_YUSEONG("대전광역시", "200", "유성구"),
    DAEJEON_DAEDEOK("대전광역시", "230", "대덕구"),
    ULSAN_JUNG("울산광역시", "110", "중구"),
    ULSAN_NAM("울산광역시", "140", "남구"),
    ULSAN_DONG("울산광역시", "170", "동구"),
    ULSAN_BUK("울산광역시", "200", "북구"),
    ULSAN_ULJU("울산광역시", "710", "울주군"),
    SEJONG("세종시", "110", "세종시"),

    GYEONGGI_Suwon("경기도", "110", "수원시"),
    GYEONGGI_Suwon_JANGAN("경기도", "111", "수원시 장안구"),
    GYEONGGI_Suwon_GWONSEON("경기도", "113", "수원시 권선구"),
    GYEONGGI_Suwon_PALDAL("경기도", "115", "수원시 팔달구"),
    GYEONGGI_Suwon_YEONGTONG("경기도", "117", "수원시 영통구"),
    GYEONGGI_SEONGNAM("경기도", "130", "성남시"),
    GYEONGGI_SEONGNAM_SUJUNG("경기도", "131", "성남시 수정구"),
    GYEONGGI_SEONGNAM_JUNGWON("경기도", "133", "성남시 중원구"),
    GYEONGGI_SEONGNAM_BUNDANG("경기도", "135", "성남시 분당구"),
    GYEONGGI_UIJEONGBU("경기도", "150", "의정부시"),
    GYEONGGI_ANYANG("경기도", "170", "안양시"),
    GYEONGGI_ANYANG_MANAN("경기도", "171", "안양시 만안구"),
    GYEONGGI_ANYANG_DONGAN("경기도", "173", "안양시 동안구"),
    GYEONGGI_BUCHEON("경기도", "190", "부천시"),
    GYEONGGI_GWANGMYEONG("경기도", "210", "광명시"),
    GYEONGGI_PYONGTAEK("경기도", "220", "평택시"),
    GYEONGGI_SONGTAN("경기도", "222", "송탄출장소"),
    GYEONGGI_ANJUNG("경기도", "224", "안중출장소"),
    GYEONGGI_DONGDUCHEON("경기도", "250", "동두천시"),
    GYEONGGI_ANSAN("경기도", "270", "안산시"),
    GYEONGGI_ANSAN_SANGROK("경기도", "271", "안산시 상록구"),
    GYEONGGI_ANSAN_DANWON("경기도", "273", "안산시 단원구"),
    GYEONGGI_GOYANG("경기도", "280", "고양시"),
    GYEONGGI_GOYANG_DEOKYANG("경기도", "281", "고양시 덕양구"),
    GYEONGGI_GOYANG_ILSANDONG("경기도", "285", "고양시 일산동구"),
    GYEONGGI_GOYANG_ILSANSO("경기도", "287", "고양시 일산서구"),
    GYEONGGI_GWACHEON("경기도", "290", "과천시"),
    GYEONGGI_GURI("경기도", "310", "구리시"),
    GYEONGGI_NAMYANGJU("경기도", "360", "남양주시"),
    GYEONGGI_PUNGYANG("경기도", "362", "풍양출장소"),
    GYEONGGI_OSAN("경기도", "370", "오산시"),
    GYEONGGI_SIHEUNG("경기도", "390", "시흥시"),
    GYEONGGI_GUNPO("경기도", "410", "군포시"),
    GYEONGGI_UIWANG("경기도", "430", "의왕시"),
    GYEONGGI_HANAM("경기도", "450", "하남시"),
    GYEONGGI_YONGIN("경기도", "460", "용인시"),
    GYEONGGI_YONGIN_CHEOIN("경기도", "461", "용인시 처인구"),
    GYEONGGI_YONGIN_GIHEUNG("경기도", "463", "용인시 기흥구"),
    GYEONGGI_YONGIN_SUJI("경기도", "465", "용인시 수지구"),
    GYEONGGI_PAJU("경기도", "480", "파주시"),
    GYEONGGI_ICHEON("경기도", "500", "이천시"),
    GYEONGGI_ANSEONG("경기도", "550", "안성시"),
    GYEONGGI_GIMPO("경기도", "570", "김포시"),
    GYEONGGI_HWASEONG("경기도", "590", "화성시"),
    GYEONGGI_HWASEONG_DONGBU("경기도", "592", "화성시동부출장소"),
    GYEONGGI_HWASEONG_DONGTAN("경기도", "594", "화성시동탄출장소"),
    GYEONGGI_GWANGJU("경기도", "610", "광주시"),
    GYEONGGI_YANGJU("경기도", "630", "양주시"),
    GYEONGGI_POCHON("경기도", "650", "포천시"),
    GYEONGGI_YEOJU("경기도", "670", "여주시"),
    GYEONGGI_YEONCHEON("경기도", "800", "연천군"),
    GYEONGGI_GAPYEONG("경기도", "820", "가평군"),
    GYEONGGI_YANGPYEONG("경기도", "830", "양평군"),

    GANGWON_CHUNCHEON("강원도", "110", "춘천시"),
    GANGWON_WONJU("강원도", "130", "원주시"),
    GANGWON_GANGNEUNG("강원도", "150", "강릉시"),
    GANGWON_DONGHAE("강원도", "170", "동해시"),
    GANGWON_TAEBACK("강원도", "190", "태백시"),
    GANGWON_SOKCHO("강원도", "210", "속초시"),
    GANGWON_SAMCHEOK("강원도", "230", "삼척시"),
    GANGWON_HONGCHUN("강원도", "720", "홍천군"),
    GANGWON_HEUNGSEONG("강원도", "730", "횡성군"),
    GANGWON_YEONGWOL("강원도", "750", "영월군"),
    GANGWON_PYONGCHANG("강원도", "760", "평창군"),
    GANGWON_JEONGSEON("강원도", "770", "정선군"),
    GANGWON_CHEORWON("강원도", "780", "철원군"),
    GANGWON_HWACHEON("강원도", "790", "화천군"),
    GANGWON_YANGGU("강원도", "800", "양구군"),
    GANGWON_INJE("강원도", "810", "인제군"),
    GANGWON_GOSEONG("강원도", "820", "고성군"),
    GANGWON_YANGYANG("강원도", "830", "양양군"),

    CHUNGBUK_CHEONGJU("충청북도", "110", "청주시"),
    CHUNGBUK_CHEONGJU_SANGDANG("충청북도", "111", "청주시 상당구"),
    CHUNGBUK_CHEONGJU_SEOWON("충청북도", "112", "청주시 서원구"),
    CHUNGBUK_CHEONGJU_HEUNGDEOK("충청북도", "113", "청주시 흥덕구"),
    CHUNGBUK_CHEONGJU_CHEONGWON("충청북도", "114", "청주시 청원구"),
    CHUNGBUK_CHUNGJU("충청북도", "130", "충주시"),
    CHUNGBUK_JE_CHEON("충청북도", "150", "제천시"),
    CHUNGBUK_BOEUN("충청북도", "720", "보은군"),
    CHUNGBUK_OKCHEON("충청북도", "730", "옥천군"),
    CHUNGBUK_YEONGDONG("충청북도", "740", "영동군"),
    CHUNGBUK_JEUNGPYEONG("충청북도", "745", "증평군"),
    CHUNGBUK_JINCHEON("충청북도", "750", "진천군"),
    CHUNGBUK_GWESAN("충청북도", "760", "괴산군"),
    CHUNGBUK_EUMSEONG("충청북도", "770", "음성군"),
    CHUNGBUK_DANYANG("충청북도", "800", "단양군"),
    CHUNGNAM_CHEONAN("충청남도", "130", "천안시"),
    CHUNGNAM_CHEONAN_DONGNAM("충청남도", "131", "천안시 동남구"),
    CHUNGNAM_CHEONAN_SEOBUK("충청남도", "133", "천안시 서북구"),
    CHUNGNAM_GONGJU("충청남도", "150", "공주시"),
    CHUNGNAM_BORYEONG("충청남도", "180", "보령시"),
    CHUNGNAM_ASAN("충청남도", "200", "아산시"),
    CHUNGNAM_SEOSAN("충청남도", "210", "서산시"),
    CHUNGNAM_NONSAN("충청남도", "230", "논산시"),
    CHUNGNAM_GYERYONG("충청남도", "250", "계룡시"),
    CHUNGNAM_DANGJIN("충청남도", "270", "당진시"),
    CHUNGNAM_GEUMSAN("충청남도", "710", "금산군"),
    CHUNGNAM_BUWEO("충청남도", "760", "부여군"),
    CHUNGNAM_SEOCHEON("충청남도", "770", "서천군"),
    CHUNGNAM_CHEONGYANG("충청남도", "790", "청양군"),
    CHUNGNAM_HONGSEONG("충청남도", "800", "홍성군"),
    CHUNGNAM_YESAN("충청남도", "810", "예산군"),
    CHUNGNAM_TAAN("충청남도", "825", "태안군"),

    JEONBUK_JEONJU("전라북도", "110", "전주시"),
    JEONBUK_JEONJU_WANSAN("전라북도", "111", "전주시 완산구"),
    JEONBUK_JEONJU_DEOKJIN("전라북도", "113", "전주시 덕진구"),
    JEONBUK_JEONJU_HYOJA("전라북도", "118", "전주시효자출"),
    JEONBUK_GUNSAN("전라북도", "130", "군산시"),
    JEONBUK_IKSAN("전라북도", "140", "익산시"),
    JEONBUK_IKSAN_HAMYEOL("전라북도", "145", "익산시함열출"),
    JEONBUK_JEONGEUP("전라북도", "180", "정읍시"),
    JEONBUK_NAMWON("전라북도", "190", "남원시"),
    JEONBUK_GIMJE("전라북도", "210", "김제시"),
    JEONBUK_WANJU("전라북도", "710", "완주군"),
    JEONBUK_JINAN("전라북도", "720", "진안군"),
    JEONBUK_MUJU("전라북도", "730", "무주군"),
    JEONBUK_JANGSU("전라북도", "740", "장수군"),
    JEONBUK_IMSIL("전라북도", "750", "임실군"),
    JEONBUK_SUNCHANG("전라북도", "770", "순창군"),
    JEONBUK_GOCHANG("전라북도", "790", "고창군"),
    JEONBUK_BUAN("전라북도", "800", "부안군"),

    JEONNAM_MOKPO("전라남도", "110", "목포시"),
    JEONNAM_YEOSU("전라남도", "130", "여수시"),
    JEONNAM_SUNCHEON("전라남도", "150", "순천시"),
    JEONNAM_NAJU("전라남도", "170", "나주시"),
    JEONNAM_GWANGYANG("전라남도", "230", "광양시"),
    JEONNAM_DAMYANG("전라남도", "710", "담양군"),
    JEONNAM_GOKSEONG("전라남도", "720", "곡성군"),
    JEONNAM_GURYE("전라남도", "730", "구례군"),
    JEONNAM_GOHEUNG("전라남도", "770", "고흥군"),
    JEONNAM_BOSEONG("전라남도", "780", "보성군"),
    JEONNAM_HWASOON("전라남도", "790", "화순군"),
    JEONNAM_JANGHEUNG("전라남도", "800", "장흥군"),
    JEONNAM_GANGJIN("전라남도", "810", "강진군"),
    JEONNAM_HAENAM("전라남도", "820", "해남군"),
    JEONNAM_YEONGAM("전라남도", "830", "영암군"),
    JEONNAM_MOOAN("전라남도", "840", "무안군"),
    JEONNAM_HAMPYEONG("전라남도", "860", "함평군"),
    JEONNAM_YEONGGWANG("전라남도", "870", "영광군"),
    JEONNAM_JANGSEONG("전라남도", "880", "장성군"),
    JEONNAM_WANDO("전라남도", "890", "완도군"),
    JEONNAM_JINDO("전라남도", "900", "진도군"),
    JEONNAM_SHINAN("전라남도", "910", "신안군"),

    GYEONGSANGBUKDO_POHANG("경상북도", "110", "포항시"),
    GYEONGSANGBUKDO_POHANG_NAM("경상북도", "111", "포항시 남구"),
    GYEONGSANGBUKDO_POHANG_BUK("경상북도", "113", "포항시 북구"),
    GYEONGSANGBUKDO_GYEONGJU("경상북도", "130", "경주시"),
    GYEONGSANGBUKDO_GIMCHEON("경상북도", "150", "김천시"),
    GYEONGSANGBUKDO_ANDONG("경상북도", "170", "안동시"),
    GYEONGSANGBUKDO_GUMI("경상북도", "190", "구미시"),
    GYEONGSANGBUKDO_YEONGJU("경상북도", "210", "영주시"),
    GYEONGSANGBUKDO_YEONGCHEON("경상북도", "230", "영천시"),
    GYEONGSANGBUKDO_SANGJU("경상북도", "250", "상주시"),
    GYEONGSANGBUKDO_MUNGYEONG("경상북도", "280", "문경시"),
    GYEONGSANGBUKDO_GYEONGSAN("경상북도", "290", "경산시"),
    GYEONGSANGBUKDO_GUNWI("경상북도", "720", "군위군"),
    GYEONGSANGBUKDO_UISUNG("경상북도", "730", "의성군"),
    GYEONGSANGBUKDO_CHEONGSONG("경상북도", "750", "청송군"),
    GYEONGSANGBUKDO_YEONGYANG("경상북도", "760", "영양군"),
    GYEONGSANGBUKDO_YEONGDEOK("경상북도", "770", "영덕군"),
    GYEONGSANGBUKDO_CHEONGDO("경상북도", "820", "청도군"),
    GYEONGSANGBUKDO_GORYEONG("경상북도", "830", "고령군"),
    GYEONGSANGBUKDO_SEONGJU("경상북도", "840", "성주군"),
    GYEONGSANGBUKDO_CHILGOK("경상북도", "850", "칠곡군"),
    GYEONGSANGBUKDO_YECHEON("경상북도", "900", "예천군"),
    GYEONGSANGBUKDO_BONGHWA("경상북도", "920", "봉화군"),
    GYEONGSANGBUKDO_ULJIN("경상북도", "930", "울진군"),

    GYEONGSANGBUKDO_ULLEUNG("경상북도", "940", "울릉군"),
    GYEONGSANGNAMDO_CHANGWON("경상남도", "120", "창원시"),
    GYEONGSANGNAMDO_CHANGWON_UICHANG("경상남도", "121", "창원시 의창구"),
    GYEONGSANGNAMDO_CHANGWON_SEONGSAN("경상남도", "123", "창원시 성산구"),
    GYEONGSANGNAMDO_CHANGWON_MASANHAPPO("경상남도", "125", "창원시 마산합포구"),
    GYEONGSANGNAMDO_CHANGWON_MASANHOE("경상남도", "127", "창원시 마산회원구"),
    GYEONGSANGNAMDO_CHANGWON_JINHAE("경상남도", "129", "창원시 진해구"),
    GYEONGSANGNAMDO_JINJU("경상남도", "170", "진주시"),
    GYEONGSANGNAMDO_TONGYEONG("경상남도", "220", "통영시"),
    GYEONGSANGNAMDO_SACHEON("경상남도", "240", "사천시"),
    GYEONGSANGNAMDO_SACHEON_NAMYANG("경상남도", "245", "사천남양출장"),
    GYEONGSANGNAMDO_GIMHAE("경상남도", "250", "김해시"),
    GYEONGSANGNAMDO_GIMHAE_JANGYU("경상남도", "252", "장유출장소"),
    GYEONGSANGNAMDO_MIRYANG("경상남도", "270", "밀양시"),
    GYEONGSANGNAMDO_GEOJE("경상남도", "310", "거제시"),
    GYEONGSANGNAMDO_YANGSAN("경상남도", "330", "양산시"),
    GYEONGSANGNAMDO_YANGSAN_WONGSANG("경상남도", "332", "양산시웅상출장소"),
    GYEONGSANGNAMDO_UIRYUNG("경상남도", "720", "의령군"),
    GYEONGSANGNAMDO_HAMAN("경상남도", "730", "함안군"),
    GYEONGSANGNAMDO_CHANGNYEONG("경상남도", "740", "창녕군"),
    GYEONGSANGNAMDO_GOSEONG("경상남도", "820", "고성군"),
    GYEONGSANGNAMDO_NAMHAE("경상남도", "840", "남해군"),
    GYEONGSANGNAMDO_HADONG("경상남도", "850", "하동군"),

    GYEONGSANGNAMDO_SANCHEONG("경상남도", "860", "산청군"),
    GYEONGSANGNAMDO_HAMYANG("경상남도", "870", "함양군"),
    GYEONGSANGNAMDO_GEOMSUNG("경상남도", "880", "거창군"),
    GYEONGSANGNAMDO_HAPCHEON("경상남도", "890", "합천군"),
    
    JEJU_JEJU("제주특별시", "110", "제주시"),
    JEJU_SEOGWIPO("제주특별시", "130", "서귀포시");
    ;

    private final String cityName;
    private final String distinctCode;
    private final String distinctName;

    AddressDistinct(String cityName, String distinctCode, String distinctName) {
        this.cityName = cityName;
        this.distinctCode = distinctCode;
        this.distinctName = distinctName;
    }

    public String getCityName() {
        return cityName;
    }

    public String getDistinctCode() {
        return distinctCode;
    }

    public String getDistinctName() {
        return distinctName;
    }
}
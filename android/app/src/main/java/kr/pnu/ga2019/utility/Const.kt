package kr.pnu.ga2019.utility

import kr.pnu.ga2019.R
import kr.pnu.ga2019.domain.entity.Museum

/*
 * Created by Lee Oh Hyoung on 2020/06/09 .. 
 */
object Const {

    val PERSON_IMAGES: List<Int> = listOf(
        R.drawable.image_person_1,
        R.drawable.image_person_2,
        R.drawable.image_person_3,
        R.drawable.image_person_4,
        R.drawable.image_person_5,
        R.drawable.image_person_6,
        R.drawable.image_person_7
    )
    fun random() = PERSON_IMAGES.random()

    val MUSEUM_POINTS: List<Museum> = listOf(
        Museum(0,"전쟁전시관", R.drawable.img_point_1),
        Museum(1,"고대전시관", R.drawable.img_point_2),
        Museum(2,"중세전시관", R.drawable.img_point_3),
        Museum(3,"현대전시관", R.drawable.img_point_4),
        Museum(4,"미래전시관", R.drawable.img_point_5),
        Museum(5,"예술전시관", R.drawable.img_point_6)
    )

    val POINT_IMAGES: List<Int> = MUSEUM_POINTS.map { it.resId }

    fun randomPointImage() = POINT_IMAGES.random()

    val PAGE_IMAGES: List<Int> = listOf(
        R.drawable.img_pager_1,
        R.drawable.img_pager_2,
        R.drawable.img_pager_3
    )

    val METHOD_LIST = listOf(
        "현재 입구는 고대 전시관/과학 전시관 이므로\n둘 중 하나를 선택하여 입장하세요",
        "새로운 전시관에 입장하였다면,\n관람시간을 측정하고 다음 추천 경로에 반영합니다",
        "이전에 관람했던 전시관과 관람시간을 기준으로 다음 전시관을 안내 받을 수 있습니다"
    )

    val VISITOR_METHODS = listOf(
        VisitorMethod(R.drawable.img_visitor_1, "현재 입구는 고대 전시관/과학 전시관 이므로 둘 중 하나를 선택하여 입장하세요"),
        VisitorMethod(R.drawable.img_visitor_2, "새로운 전시관에 입장하였다면,\n관람시간을 측정하고 다음 추천 경로에 반영합니다"),
        VisitorMethod(R.drawable.img_visitor_3, "이전에 관람했던 전시관과 관람시간을 기준으로 다음 전시관을 안내 받을 수 있습니다")
    )
}

data class VisitorMethod(
    val image: Int,
    val description: String
)
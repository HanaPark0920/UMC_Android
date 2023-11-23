package com.example.flo

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class BannerVPAdapter(fragment: Fragment) :FragmentStateAdapter(fragment) {

    private val fragmentlist : ArrayList<Fragment> = ArrayList();

    //클래스에서 연결된 뷰페이저에 데이터를 전달할 때 데이터를 몇개를 전달할건지 작성
    override fun getItemCount(): Int =fragmentlist.size


    override fun createFragment(position: Int): Fragment = fragmentlist[position]

    fun addFragment(fragment: Fragment) {
        fragmentlist.add(fragment)
        notifyItemInserted(fragmentlist.size-1)
    }
}
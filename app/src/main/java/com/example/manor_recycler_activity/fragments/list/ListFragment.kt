package com.example.manor_recycler_activity.fragments.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.manor_recycler_activity.data.ZodiacViewModel
import com.example.roomdb.R

class ListFragment : Fragment() {

    private lateinit var mZodiacViewModel: ZodiacViewModel
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_list, container, false)

        val adapter =

        mZodiacViewModel = ViewModelProvider(this).get(ZodiacViewModel::class.java)
        mZodiacViewModel = readAllData.observe(viewLifecycleOwner, Observer { Sign ->
            adapter.setData(Sign)
        })

        return view
    }
}
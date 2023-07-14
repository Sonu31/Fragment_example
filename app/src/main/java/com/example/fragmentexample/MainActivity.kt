package com.example.fragmentexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.fragmentexample.databinding.ActivityMainBinding
import com.example.fragmentexample.databinding.FragmentFivefragmentBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var navcontrollar: NavController
    var sd:Int=0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navcontrollar = navHostFragment.navController
        setupActionBarWithNavController(navcontrollar)
        setContentView(binding.root)


    }

    override fun onSupportNavigateUp(): Boolean {
        return navcontrollar.navigateUp() || super.onSupportNavigateUp()
    }


    override fun onResume() {
        navcontrollar.addOnDestinationChangedListener { controller, destination, arguments ->
            when (destination.id) {
//                R.id.home_Frag -> binding.itoolbarid.toolbarid.visibility = View.GONE
//                else -> binding.itoolbarid.toolbarid.visibility = View.VISIBLE
            }
        }
        super.onResume()
    }

    override fun onBackPressed() {
        val navController = findNavController(R.id.nav_host_fragment)
        val destination = navController.currentDestination
        if (destination?.id == R.id.homefragment) {

        }


        super.onBackPressed()
    }



    override fun onDestinationChanged(
        controller: NavController,
        destination: NavDestination,
        arguments: Bundle?
    ) {

        if (destination.id == R.id.homefragment) {
            Toast.makeText(this, "home fragment", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "not home fragment", Toast.LENGTH_SHORT).show()
        }
    }

    private fun hideToolbar() {
        navcontrollar.addOnDestinationChangedListener { controller, destination, arguments ->
            when (destination.id) {
//                R.id.homefragment -> binding.itoolbarid.toolbarid.visibility = View.GONE
//                else -> binding.itoolbarid.toolbarid.visibility = View.VISIBLE
            }
        }
    }


}
package com.example.bt_receiver.view

import android.bluetooth.BluetoothManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.bt_receiver.R
import com.example.bt_receiver.constants.AppConstants
import com.example.bt_receiver.databinding.ActivityMainBinding
import com.example.bt_receiver.viewmodel.MainViewModel

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var bluetoothManager: BluetoothManager
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)

        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        supportActionBar?.hide()

        setBluetooth()
        setContentView(binding.root)
    }

    override fun onClick(view: View) {
        when(view.id) {
            R.id.image_button_play -> {

            }
            R.id.image_button_next -> {

            }
            R.id.image_button_back -> {

            }
            R.id.image_button_bluetooth -> {

            }
        }
    }

    private fun setBluetooth() {
        bluetoothManager = getSystemService(BluetoothManager::class.java)

        if (bluetoothManager.adapter?.isEnabled == false) {
            Toast.makeText(
                this,
                AppConstants.ALERT.BT.NOT_ENABLE,
                Toast.LENGTH_LONG).show()
        } else if (bluetoothManager.adapter == null) {
            Toast.makeText(
                this,
                AppConstants.ALERT.BT.NOT_FOUND,
                Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(
                this,
                AppConstants.ALERT.BT.ENABLE,
                Toast.LENGTH_LONG).show()
        }
    }
}
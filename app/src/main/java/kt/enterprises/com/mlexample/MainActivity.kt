package kt.enterprises.com.mlexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import kt.enterprises.com.mlexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() , View.OnClickListener {


    private lateinit var mBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mBinding = DataBindingUtil.setContentView(this@MainActivity,R.layout.activity_main)

        mBinding.apply {
            btnMotion1.setOnClickListener(this@MainActivity)
            btnMotion2.setOnClickListener(this@MainActivity)
            btnMotion3.setOnClickListener(this@MainActivity)
        }


    }

    override fun onClick(view: View?) {

        when (view?.id){
            null ->{}

            R.id.btn_motion_1 ->{
                openActivity(MotionBasic1Activity::class.java)
            }

            R.id.btn_motion_2 ->{
                openActivity(MotionBasic2Activity::class.java)
            }

            R.id.btn_motion_3 ->{
                openActivity(MotionBasic3Activity::class.java)
            }

        }
    }

    fun openActivity(activityName : Class<*> ){
        startActivity(Intent(this@MainActivity,activityName))
    }
}

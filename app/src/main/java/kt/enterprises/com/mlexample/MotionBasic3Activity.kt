package kt.enterprises.com.mlexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.databinding.DataBindingUtil
import kt.enterprises.com.mlexample.databinding.ActivityMotionBasic3Binding

class MotionBasic3Activity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMotionBasic3Binding
    private var mSataus: Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_motion_basic3)

        mBinding = DataBindingUtil.setContentView(this@MotionBasic3Activity, R.layout.activity_motion_basic3)

        mBinding.apply {

            motionLayout.transitionToEnd()

            motionLayout.setTransitionListener(object : MotionLayout.TransitionListener {
                override fun onTransitionChange(p0: MotionLayout?, p1: Int, p2: Int, p3: Float) {

                }

                override fun onTransitionCompleted(p0: MotionLayout?, p1: Int) {
                    //Toast.makeText(this@MotionBasic3Activity,"ended",Toast.LENGTH_LONG).show()
                    animate(mSataus)
                }
            })
        }
    }

    private fun animate(status: Int) {
        if (status == 1) {
            mSataus = 0
            mBinding.motionLayout.transitionToStart()
        } else {
            mSataus = 1
            mBinding.motionLayout.transitionToEnd()
        }
    }
}

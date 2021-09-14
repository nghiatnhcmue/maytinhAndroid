package com.example.maytinh

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Math.pow
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttoncong.setOnClickListener {
            var sothu1: Float = (edittextthu1.text.toString()).toFloat()
            var sothu2: Float = (edittextthu2.text.toString()).toFloat()
            var kq: Float = sothu1 + sothu2
            textviewkq.text = kq.toString()
        }
        buttontru.setOnClickListener {
            var sothu1: Float = (edittextthu1.text.toString()).toFloat()
            var sothu2: Float = (edittextthu2.text.toString()).toFloat()
            var kq: Float = sothu1 - sothu2
            textviewkq.text = kq.toString()
        }
        buttonsqrt.setOnClickListener {
            var sothu1: Float = (edittextthu1.text.toString()).toFloat()
            var kq: Float = sqrt(sothu1)
            textviewkq.text = kq.toString()
        }
        buttonnhan.setOnClickListener {
            var sothu1: Float = (edittextthu1.text.toString()).toFloat()
            var sothu2: Float = (edittextthu2.text.toString()).toFloat()
            var kq: Float = sothu1 * sothu2
            textviewkq.text = kq.toString()
        }
        buttonchia.setOnClickListener {
            var sothu1: Float = (edittextthu1.text.toString()).toFloat()
            var sothu2: Float = (edittextthu2.text.toString()).toFloat()
            var kq: Float
            if (sothu2 != 0.0f) {
                kq = sothu1 / sothu2
                textviewkq.text = kq.toString()
            } else {
                textviewkq.text = "Vô cùng"
            }
        }
        buttonbpt1.setOnClickListener {
            var sothu1: Float = (edittextthu1.text.toString()).toFloat()
            var sothu2: Float = (edittextthu2.text.toString()).toFloat()
            var kq: Float
            if (sothu1 == 0.0f && sothu2 > 0) {
                textviewkq.text = "Bất phương trình vô số nghiệm"
            }
            if (sothu1 == 0.0f && sothu2 <= 0) {
                textviewkq.text = "Bất phương trình vô nghiệm"
            }
            if (sothu1 < 0) {
                kq = -sothu2 / sothu1
                textviewkq.text = "Bất phương trình có nghiệm x < " + kq.toString()
            }
            if (sothu1 > 0) {
                kq = -sothu2 / sothu1
                textviewkq.text = "Bất phương trình có nghiệm x > " + kq.toString()
            }
        }
        buttonbpt2.setOnClickListener {
            var sothu1: Float = (edittextthu1.text.toString()).toFloat()
            var sothu2: Float = (edittextthu2.text.toString()).toFloat()
            var kq: Float
            if (sothu1 == 0.0f && sothu2 < 0) {
                textviewkq.text = "Bất phương trình vô số nghiệm"
            }
            if (sothu1 == 0.0f && sothu2 >= 0) {
                textviewkq.text = "Bất phương trình vô nghiệm"
            }
            if (sothu1 < 0) {
                kq = -sothu2 / sothu1
                textviewkq.text = "Bất phương trình có nghiệm x > " + kq.toString()
            }
            if (sothu1 > 0) {
                kq = -sothu2 / sothu1
                textviewkq.text = "Bất phương trình có nghiệm x < " + kq.toString()
            }
        }
        buttonbpt3.setOnClickListener {
            var sothu1: Float = (edittextthu1.text.toString()).toFloat()
            var sothu2: Float = (edittextthu2.text.toString()).toFloat()
            var kq: Float
            if (sothu1 == 0.0f && sothu2 >= 0) {
                textviewkq.text = "Bất phương trình vô số nghiệm"
            }
            if (sothu1 == 0.0f && sothu2 < 0) {
                textviewkq.text = "Bất phương trình vô nghiệm"
            }
            if (sothu1 < 0) {
                kq = -sothu2 / sothu1
                textviewkq.text = "Bất phương trình có nghiệm x <= " + kq.toString()
            }
            if (sothu1 > 0) {
                kq = -sothu2 / sothu1
                textviewkq.text = "Bất phương trình có nghiệm x >= " + kq.toString()
            }
        }
        buttonbpt4.setOnClickListener {
            var sothu1: Float = (edittextthu1.text.toString()).toFloat()
            var sothu2: Float = (edittextthu2.text.toString()).toFloat()
            var kq: Float
            if (sothu1 == 0.0f && sothu2 > 0) {
                textviewkq.text = "Bất phương trình vô nghiệm"
            }
            if (sothu1 == 0.0f && sothu2 <= 0) {
                textviewkq.text = "Bất phương trình vô số nghiệm"
            }
            if (sothu1 < 0) {
                kq = -sothu2 / sothu1
                textviewkq.text = "Bất phương trình có nghiệm x >= " + kq.toString()
            }
            if (sothu1 > 0) {
                kq = -sothu2 / sothu1
                textviewkq.text = "Bất phương trình có nghiệm x <= " + kq.toString()
            }
        }
        buttonptb1.setOnClickListener {
            var sothu1: Float = (edittextthu1.text.toString()).toFloat()
            var sothu2: Float = (edittextthu2.text.toString()).toFloat()
            var kq: Float
            if (sothu1 == 0.0f && sothu2 != 0.0f) {
                textviewkq.text = "Phương trình vô nghiệm"
            }
            if (sothu1 == 0.0f && sothu2 == 0.0f) {
                textviewkq.text = "Phương trình vô số nghiệm"
            }
            if (sothu1 != 0.0f) {
                kq = -sothu2 / sothu1
                textviewkq.text = "Phương trình có nghiệm x = " + kq.toString()
            }
        }
        buttonptb2.setOnClickListener {
            var sothu1: Float = (edittextthu1.text.toString()).toFloat()
            var sothu2: Float = (edittextthu2.text.toString()).toFloat()
            var sothu3: Float = (edittextthu3.text.toString()).toFloat()

            var del: Float
            var kq: Float
            var kq1: Float
            if (sothu1 == 0.0f) {
                textviewkq.text = "Giải theo phương trình bậc 1"
            }
            if (sothu1 != 0.0f) {
                del = (pow(sothu2.toDouble(), 2.0) - (4 * sothu1 * sothu3)).toFloat()
                if (del < 0) {
                    textviewkq.text = "Phương trình vô nghiệm"
                }
                if (del == 0.0f) {
                    kq = -sothu2 / (2 * sothu1)
                    textviewkq.text = "Phương trình có nghiệm kép x = " + kq.toString()
                }
                if (del > 0.0f) {
                    kq = (-sothu2 - sqrt(del)) / (2 * sothu1)
                    kq1 = (-sothu2 + sqrt(del)) / (2 * sothu1)
                    textviewkq.text =
                        "Phương trình có 2 nghiệm phân biệt x1= " + kq.toString() + " và x2= " + kq1.toString()
                }
            }
        }
        buttonhpt.setOnClickListener {
            var st1: Float = (edittextthu1.text.toString()).toFloat()
            var st2: Float = (edittextthu2.text.toString()).toFloat()
            var st3: Float = (edittextthu3.text.toString()).toFloat()
            var st4: Float = (edittextthu4.text.toString()).toFloat()
            var st5: Float = (edittextthu5.text.toString()).toFloat()
            var st6: Float = (edittextthu6.text.toString()).toFloat()
            var d: Float
            var dx: Float
            var dy: Float
            var x: Float
            var y: Float
            d = st1 * st5 - st4 * st2
            dx = st3 * st5 - st6 * st2
            dy = st1 * st6 - st4 * st3
            if (d == 0.0f) {
                if (st3 == st6) {
                    textviewkq.text = "Hệ phương trình có vô số nghiệm"
                } else {
                    textviewkq.text = "Hệ phương trình vô nghiệm"
                }
            }
                else  {
                    x = dx/d
                    y = dy/d
                    textviewkq.text = "Hệ phương trình có nghiệm x=" + x.toString() + " và y= " + y.toString()
                }
            }
        buttonnt.setOnClickListener {
            var sothu1: Float = (edittextthu1.text.toString()).toFloat()
            var sothu2: Float = (edittextthu2.text.toString()).toFloat()
            var kq: Float
            if (sothu1 != 0.0f) {
                kq = -sothu2 / sothu1
                if (sothu1 > 0.0f) {
                    textviewkq.text = "f(x)>0 trên (" + kq.toString()+";+vc); f(x)<0 trên (-vc;"+ kq.toString()+")"
                }
                else{
                    textviewkq.text = "f(x)<0 với trên (" + kq.toString()+";+vc); f(x)>0 với trên (-vc;"+ kq.toString()+")"
                }
            }
        }
        buttontt.setOnClickListener {
            var sothu1: Float = (edittextthu1.text.toString()).toFloat()
            var sothu2: Float = (edittextthu2.text.toString()).toFloat()
            var sothu3: Float = (edittextthu3.text.toString()).toFloat()

            var del: Float
            var kq: Float
            var kq1: Float
            if (sothu1 == 0.0f) {
                textviewkq.text = "Giải theo f(x) = ax + b"
            }
            if (sothu1 != 0.0f) {
                del = (pow(sothu2.toDouble(), 2.0) - (4 * sothu1 * sothu3)).toFloat()
                if (del < 0) {
                    if (sothu1 > 0.0f) {
                        textviewkq.text = "f(x)>0 với trên R"
                    }
                    else{
                        textviewkq.text = "f(x)<0 với trên R"
                    }
                }
                if (del == 0.0f) {
                    kq = -sothu2 / (2 * sothu1)
                    if (sothu1 > 0.0f) {
                        textviewkq.text = "f(x)>0 với trên R/" + kq.toString()
                    }
                    else{
                        textviewkq.text = "f(x)<0 với trên R/" + kq.toString()
                    }
                }
                if (del > 0.0f) {
                    kq = (-sothu2 - sqrt(del)) / (2 * sothu1)
                    kq1 = (-sothu2 + sqrt(del)) / (2 * sothu1)
                    if (sothu1 > 0.0f) {
                        textviewkq.text = "f(x)<0 trên (" + kq.toString()+";"+ kq1.toString()+"); f(x)>0 trên (-vc;"+ kq.toString()+") và ("+ kq.toString()+";+vc)"
                    }
                    else{
                        textviewkq.text = "f(x)>0 trên (" + kq.toString()+";"+ kq1.toString()+"); f(x)<0 trên (-vc;"+ kq.toString()+") và ("+ kq.toString()+";+vc)"

                    }

                }
            }
        }
            buttonxoa.setOnClickListener {
                textviewkq.text = "0"
            }
        }
    }


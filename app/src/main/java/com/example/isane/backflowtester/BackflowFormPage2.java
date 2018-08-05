package com.example.isane.backflowtester;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import java.sql.Time;
import java.util.Date;

public class BackflowFormPage2 extends AppCompatActivity {

    private CheckBox checkBoxCV1ClosedYes, checkBoxCV1ClosedNo, checkBoxCV1LeakedYes, checkBoxCV1LeakedNo;
    private CheckBox checkBoxCV2ClosedYes, checkBoxCV2ClosedNo, checkBoxCV2LeakedYes, checkBoxCV2LeakedNo;
    private CheckBox checkBoxRVOpenYes, checkBoxRVOpenNo;
    private CheckBox checkBoxAirInLeakYes, checkBoxAirInLeakNo;
    private CheckBox checkBoxShutOff1TightYes, checkBoxShutOff1TightNo, checkBoxShutOff1LeakedYes, checkBoxShutOff1LeakedNo, checkBoxShutOff1Repaired, checkBoxShutOff1Replaced;
    private CheckBox checkBoxShutOff2TightYes, checkBoxShutOff2TightNo, checkBoxShutOff2LeakedYes, checkBoxShutOff2LeakedNo, checkBoxShutOff2Repaired, checkBoxShutOff2Replaced;
    private CheckBox checkBoxMechanicalTestPassed, checkBoxMechanicalTestFailed;
    private CheckBox checkBoxAssemblyInstallPassed, checkBoxAssemblyInstallFailed;

    //Potentially will be used in the future
    //private CheckBox checkBoxCV1RepairsYes, checkBoxCV1RepairsNo, checkBoxCV1ReplacedYes, checkBoxCV1ReplacedNo;
    //private CheckBox checkBoxCV1SeatYes, checkBoxCV1SeatNo, checkBoxCV1SpringYes, checkBoxCV1SpringNo, checkBoxCV1GuideYes, checkBoxCV1GuideNo, checkBoxCV1OtherYes, checkBoxCV1OtherNo;
    //private CheckBox checkBoxCV2RepairsYes, checkBoxCV2RepairsNo, checkBoxCV2ReplacedYes, checkBoxCV2ReplacedNo;
    //private CheckBox checkBoxCV2SeatYes, checkBoxCV2SeatNo, checkBoxCV2SpringYes, checkBoxCV2SpringNo, checkBoxCV2GuideYes, checkBoxCV2GuideNo, checkBoxCV2OtherYes, checkBoxCV2OtherNo;
    //private CheckBox checkBoxRVRepairsYes, checkBoxRVRepairsNo, checkBoxRVReplacedYes, checkBoxRVReplacedNo;
    //private CheckBox checkBoxRVSeatYes, checkBoxRVSeatNo, checkBoxRVSpringYes, checkBoxRVSpringNo, checkBoxRVGuideYes, checkBoxRVGuideNo, checkBoxRVOtherYes, checkBoxRVOtherNo;
    //private CheckBox checkBoxAirInRepairsYes, checkBoxAirInRepairsNo, checkBoxAirInReplacedYes, checkBoxAirInReplacedNo;
    //private CheckBox checkBoxAirInSeatYes, checkBoxAirInSeatNo, checkBoxAirInSpringYes, checkBoxAirInSpringNo, checkBoxAirInGuideYes, checkBoxAirInGuideNo, checkBoxAirInOtherYes, checkBoxAirInOtherNo;


    public int cv1PSID;
    public int cv2PSID;
    public int rVPSID;
    public int airInletPSID;
    public String repairsAndComments;
    public String reasonForFailure;
    public String alarmCompanyNotified;
    public Date turnOffDate, turnOnDate;
    public Time turnOffTime, turnOnTime;
    public int aSSEAccordance;
    public String testerName;
    public int certNo;
    public Date certExpDate;
    public Date testDate;
    public Time testTime;
    public String testerPhone;
    public String testerGauge;
    public Date gaugeRecertDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_backflow_form_page2);
        setTitle(R.string.title_activity_backflow_form_page2);

        checkBoxCV1ClosedYes = findViewById(R.id.checkbox_cv1_closed_yes);
        checkBoxCV1ClosedNo = findViewById(R.id.checkbox_cv1_closed_no);
        checkBoxCV1LeakedYes = findViewById(R.id.checkbox_cv1_leaked_yes);
        checkBoxCV1LeakedNo = findViewById(R.id.checkbox_cv1_leaked_no);
        checkBoxCV2ClosedYes = findViewById(R.id.checkbox_cv2_closed_yes);
        checkBoxCV2ClosedNo = findViewById(R.id.checkbox_cv2_closed_no);
        checkBoxCV2LeakedYes = findViewById(R.id.checkbox_cv2_leaked_yes);
        checkBoxCV2LeakedNo = findViewById(R.id.checkbox_cv2_leaked_no);
        checkBoxRVOpenYes = findViewById(R.id.checkbox_rv_open_yes);
        checkBoxRVOpenNo = findViewById(R.id.checkbox_rv_open_no);
        checkBoxAirInLeakYes = findViewById(R.id.checkbox_airin_leaked_yes);
        checkBoxAirInLeakNo = findViewById(R.id.checkbox_airin_leaked_no);
        checkBoxShutOff1TightYes = findViewById(R.id.checkbox_)





    }
};


public void onCheckboxClicked(View view) {
    switch (view.getId()) {
        case R.id.cv1_closed_yes:






    }


};


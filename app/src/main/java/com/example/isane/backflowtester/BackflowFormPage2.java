package com.example.isane.backflowtester;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import java.sql.Time;
import java.util.Date;

public class BackflowFormPage2 extends AppCompatActivity {

    //Check Valve 1 (CV1)
    private CheckBox checkBoxCV1ClosedYes, checkBoxCV1ClosedNo, checkBoxCV1LeakedYes, checkBoxCV1LeakedNo;
    private CheckBox checkBoxCV1RepairsYes, checkBoxCV1RepairsNo, checkBoxCV1ReplacedYes, checkBoxCV1ReplacedNo;
    private CheckBox checkBoxCV1SeatYes, checkBoxCV1SeatNo, checkBoxCV1SpringYes, checkBoxCV1SpringNo, checkBoxCV1GuideYes, checkBoxCV1GuideNo, checkBoxCV1OtherYes, checkBoxCV1OtherNo;
    //Check Valve 2 (CV2)
    private CheckBox checkBoxCV2ClosedYes, checkBoxCV2ClosedNo, checkBoxCV2LeakedYes, checkBoxCV2LeakedNo;
    private CheckBox checkBoxCV2RepairsYes, checkBoxCV2RepairsNo, checkBoxCV2ReplacedYes, checkBoxCV2ReplacedNo;
    private CheckBox checkBoxCV2SeatYes, checkBoxCV2SeatNo, checkBoxCV2SpringYes, checkBoxCV2SpringNo, checkBoxCV2GuideYes, checkBoxCV2GuideNo, checkBoxCV2OtherYes, checkBoxCV2OtherNo;
    //Relief Valve (RV)
    private CheckBox checkBoxRVClosedYes, checkBoxRVClosedNo, checkBoxRVLeakedYes, checkBoxRVLeakedNo;
    private CheckBox checkBoxRVRepairsYes, checkBoxRVRepairsNo, checkBoxRVReplacedYes, checkBoxRVReplacedNo;
    private CheckBox checkBoxRVSeatYes, checkBoxRVSeatNo, checkBoxRVSpringYes, checkBoxRVSpringNo, checkBoxRVGuideYes, checkBoxRVGuideNo, checkBoxRVOtherYes, checkBoxRVOtherNo;
    //Air Inlet (AirIn)
    private CheckBox checkBoxAirInClosedYes, checkBoxAirInClosedNo, checkBoxAirInLeakedYes, checkBoxAirInLeakedNo;
    private CheckBox checkBoxAirInRepairsYes, checkBoxAirInRepairsNo, checkBoxAirInReplacedYes, checkBoxAirInReplacedNo;
    private CheckBox checkBoxAirInSeatYes, checkBoxAirInSeatNo, checkBoxAirInSpringYes, checkBoxAirInSpringNo, checkBoxAirInGuideYes, checkBoxAirInGuideNo, checkBoxAirInOtherYes, checkBoxAirInOtherNo;
    //Shut Off Valve (ShutOff)
    private CheckBox checkBoxShutOff1TightYes, checkBoxShutOff1TightNo, checkBoxShutOff1LeakedYes, checkBoxShutOff1LeakedNo, checkBoxShutOff1Repaired, checkBoxShutOff1Replaced;
    private CheckBox checkBoxShutOff2TightYes, checkBoxShutOff2TightNo, checkBoxShutOff2LeakedYes, checkBoxShutOff2LeakedNo, checkBoxShutOff2Repaired, checkBoxShutOff2Replaced;

    private CheckBox checkBoxMechanicalTestPassed, checkBoxMechanicalTestFailed;
    private CheckBox checkBoxAssemblyInstallPassed, checkBoxAssemblyInstallFailed;


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
    }
}


public void onCheckboxClicked(View view) {
    switch (view.getId()) {
        case R.id.cv1_closed_yes:




    }


}


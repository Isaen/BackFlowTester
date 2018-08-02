package com.example.isane.backflowtester;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.app.NavUtils;
import android.support.v4.app.TaskStackBuilder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class backflow_form extends AppCompatActivity {

    private CheckBox checkBoxExisting, checkBoxNew;
    private CheckBox checkBoxPrimary, checkBoxSecondary;
    private CheckBox checkBoxFire, checkBoxIrrigation, checkBoxProcess, checkBoxDomestic;
    private CheckBox checkBoxRP, checkBoxDC, checkBoxPVB, checkBoxOther;
    private CheckBox checkBoxPRVYes, checkBoxPRVNo;
    public String waterPurveyor;
    public String acctNo;
    public String permitNo;
    public String serviceName;
    public String servicePhysicalAddrress;
    public String serviceContactName;
    public String serviceContactEmail;
    public String serviceContactPhone;
    public String primaryLocBus;
    public String ownerOrContractorBusName;
    public String postalAddress;
    public String ownerOrContractorName;
    public String ownerOrContractorEmail;
    public String ownerOrContractorPhone;
    public int intNewOrExisting;
    public int intPurpose;
    public int intUse;
    public int intAssembly;
    public int intPRV;
    public String existingSerial;
    public String assemblyOther;
    public String manufacturerName;
    public String modelNo;
    public String sizeDevice;
    public String serialNo;
    public String dateInstalled;
    public String lastInspectionDate;
    public String linePressure;
    public String locationInBuilding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_backflow_form);
        setTitle(R.string.title_activity_backflow_form);

        //Setting onCheckboxClicked variables
        checkBoxNew = findViewById(R.id.checkbox_new);
        checkBoxExisting = findViewById(R.id.checkbox_existing);
        checkBoxPrimary = findViewById(R.id.checkbox_purpose_primary);
        checkBoxSecondary = findViewById(R.id.checkbox_purpose_secondary);
        checkBoxDomestic = findViewById(R.id.checkbox_use_domestic);
        checkBoxFire = findViewById(R.id.checkbox_use_fire);
        checkBoxIrrigation = findViewById(R.id.checkbox_use_irrigation);
        checkBoxProcess = findViewById(R.id.checkbox_use_process);
        checkBoxRP = findViewById(R.id.checkbox_assembly_rp);
        checkBoxDC = findViewById(R.id.checkbox_assembly_dc);
        checkBoxPVB = findViewById(R.id.checkbox_assembly_pvb);
        checkBoxOther = findViewById(R.id.checkbox_assembly_other);
        checkBoxPRVYes = findViewById(R.id.checkbox_prv_yes);
        checkBoxPRVNo = findViewById(R.id.checkbox_prv_no);


        //Button for layout BackflowFormPage2
        //Saving currently set variables
        findViewById(R.id.btn_backflow_page_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newDoc = new Intent(backflow_form.this, com.example.isane.backflowtester.BackflowFormPage2.class);

                final EditText Q1 = findViewById(R.id.txt_Purveyor);
                waterPurveyor = Q1.getText().toString();
                final EditText Q2 = findViewById(R.id.txt_Acct_No);
                acctNo = Q2.getText().toString();
                final EditText Q3 = findViewById(R.id.txt_Permit_No);
                permitNo = Q3.getText().toString();
                final EditText Q4 = findViewById(R.id.txt_Service_Name);
                serviceName = Q4.getText().toString();
                final EditText Q5 = findViewById(R.id.txt_Service_Physical_Address);
                servicePhysicalAddrress = Q5.getText().toString();
                final EditText Q6 = findViewById(R.id.txt_Service_Contact);
                serviceContactName = Q6.getText().toString();
                final EditText Q7 = findViewById(R.id.txt_Service_Email);
                serviceContactEmail = Q7.getText().toString();
                final EditText Q8 = findViewById(R.id.txt_Service_Phone);
                serviceContactPhone = Q8.getText().toString();
                final EditText Q9 = findViewById(R.id.txt_Primary_Service_Provided);
                primaryLocBus = Q9.getText().toString();
                final EditText Q10 = findViewById(R.id.txt_Owner_Or_Contractor_Bus_Name);
                ownerOrContractorBusName = Q10.getText().toString();
                final EditText Q11 = findViewById(R.id.txt_Postal_Address);
                postalAddress = Q11.getText().toString();
                final EditText Q12 = findViewById(R.id.txt_Owner_Or_Contractor_Name);
                ownerOrContractorName = Q12.getText().toString();
                final EditText Q13 = findViewById(R.id.txt_Owner_or_Contractor_Email);
                ownerOrContractorEmail = Q13.getText().toString();
                final EditText Q14 = findViewById(R.id.txt_Owner_Or_Contractor_Phone);
                ownerOrContractorPhone = Q14.getText().toString();
                final EditText Q15_1 = findViewById(R.id.txt_New_Serial_No);
                existingSerial = Q15_1.getText().toString();
                final EditText Q18 = findViewById(R.id.txt_assembly_other);
                assemblyOther = Q18.getText().toString();
                final EditText Q19 = findViewById(R.id.txt_Manufacturer);
                manufacturerName = Q19.getText().toString();
                final EditText Q20 = findViewById(R.id.txt_ModelNo);
                modelNo = Q20.getText().toString();
                final EditText Q21 = findViewById(R.id.txt_size);
                sizeDevice = Q21.getText().toString();
                final EditText Q22 = findViewById(R.id.txt_Serial_No);
                serialNo = Q22.getText().toString();
                final EditText Q23 = findViewById(R.id.txt_Date_Installed);
                dateInstalled = Q23.getText().toString();
                final EditText Q24 = findViewById(R.id.txt_Last_Inspection);
                lastInspectionDate = Q24.getText().toString();
                final EditText Q25 = findViewById(R.id.txt_Line_Pressure);
                linePressure = Q25.getText().toString();
                final EditText Q26 = findViewById(R.id.txt_Location);
                locationInBuilding = Q26.getText().toString();

                //finish();
                //startActivity(newDoc);

            }
        });
    }


    public void onCheckboxClicked(View view) {
        //Set "New or Existing" box states

        switch (view.getId()) {
            case R.id.checkbox_new:
                checkBoxExisting.setChecked(false);
                intNewOrExisting = 0;
                break;
            case R.id.checkbox_existing:
                checkBoxNew.setChecked(false);
                intNewOrExisting = 1;
                break;
        }
        //Set "Purpose" box states
        switch (view.getId()) {
            case R.id.checkbox_purpose_primary:
                checkBoxSecondary.setChecked(false);
                intPurpose = 0;
                break;
            case R.id.checkbox_purpose_secondary:
                checkBoxPrimary.setChecked(false);
                intPurpose = 1;
                break;
        }
        //Set "Use" box states
        switch (view.getId()) {
            case R.id.checkbox_use_domestic:
                checkBoxFire.setChecked(false);
                checkBoxIrrigation.setChecked(false);
                checkBoxProcess.setChecked(false);
                intUse = 0;
                break;
            case R.id.checkbox_use_fire:
                checkBoxDomestic.setChecked(false);
                checkBoxIrrigation.setChecked(false);
                checkBoxProcess.setChecked(false);
                intUse = 1;
                break;
            case R.id.checkbox_use_irrigation:
                checkBoxDomestic.setChecked(false);
                checkBoxFire.setChecked(false);
                checkBoxProcess.setChecked(false);
                intUse = 2;
                break;
            case R.id.checkbox_use_process:
                checkBoxDomestic.setChecked(false);
                checkBoxFire.setChecked(false);
                checkBoxIrrigation.setChecked(false);
                intUse = 3;
                break;
        }
        //Set "Assembly" box states
        switch (view.getId()) {
            case R.id.checkbox_assembly_rp:
                checkBoxDC.setChecked(false);
                checkBoxPVB.setChecked(false);
                checkBoxOther.setChecked(false);
                intAssembly = 0;
                break;
            case R.id.checkbox_assembly_dc:
                checkBoxRP.setChecked(false);
                checkBoxPVB.setChecked(false);
                checkBoxOther.setChecked(false);
                intAssembly = 1;
                break;
            case R.id.checkbox_assembly_pvb:
                checkBoxRP.setChecked(false);
                checkBoxDC.setChecked(false);
                checkBoxOther.setChecked(false);
                intAssembly = 2;
                break;
            case R.id.checkbox_assembly_other:
                checkBoxRP.setChecked(false);
                checkBoxDC.setChecked(false);
                checkBoxPVB.setChecked(false);
                intAssembly = 3;
                break;
        }
        switch (view.getId()) {
            case R.id.checkbox_prv_yes:
                checkBoxPRVNo.setChecked(false);
                intPRV = 0;
                break;
            case R.id.checkbox_prv_no:
                checkBoxPRVYes.setChecked(false);
                intPRV = 1;
                break;
        }
    }


    @Override
    public void onBackPressed() {
        Intent intent = new Intent(backflow_form.this, MainActivity.class);

        finish();
        startActivity(intent);
    }


}

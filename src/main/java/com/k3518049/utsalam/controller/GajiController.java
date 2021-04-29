package com.k3518049.utsalam.controller;

import com.k3518049.utsalam.dto.AllowanceDto;
import com.k3518049.utsalam.dto.InfoDto;
import com.k3518049.utsalam.dto.OutputDto;
import com.k3518049.utsalam.service.IGaji;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payrollinfo")
public class GajiController {
    @Autowired
    @Qualifier("CeoService")
    private IGaji hitungCeo;

    @Autowired
    @Qualifier("ManagerService")
    private IGaji hitungManager;

    @Autowired
    @Qualifier("SeniorEmpService")
    private IGaji hitungSeniorEmp;

    @Autowired
    @Qualifier("DefaultEmpService")
    private IGaji hitungDefaultEmp;

//    CEO
    @GetMapping("/ceo/{family}/{overtime}")
    public ResponseEntity<OutputDto<InfoDto>> endPointGetCeo(@PathVariable("family") Integer family,
                                                             @PathVariable("overtime") Integer overtime)
    {
        InfoDto info = new InfoDto();
        info.setFamily(family);
        info.setOvertime(overtime);
        AllowanceDto allowance = new AllowanceDto();
        Integer tunjanganFamily = hitungCeo.tunjanganFamily(info);
        Integer tunjanganOvertime = hitungCeo.tunjanganOvertime(info);
        allowance.setFamily(tunjanganFamily);
        allowance.setOvertime(tunjanganOvertime);
        Integer gajiPokok = hitungCeo.gajiPokok();
        OutputDto result = new OutputDto<>();
        result.setInfo(info);
        result.setAllowance(allowance);
        result.setBasicSalary(gajiPokok);
        return ResponseEntity.ok(result);
    }

    @PostMapping("/ceo")
    public ResponseEntity<OutputDto<InfoDto>> endPointPostCeo(@RequestBody InfoDto info)
    {
        AllowanceDto allowance = new AllowanceDto();
        Integer tunjanganFamily = hitungCeo.tunjanganFamily(info);
        Integer tunjanganOvertime = hitungCeo.tunjanganOvertime(info);
        allowance.setFamily(tunjanganFamily);
        allowance.setOvertime(tunjanganOvertime);
        Integer gajiPokok = hitungCeo.gajiPokok();
        OutputDto result = new OutputDto<>();
        result.setInfo(info);
        result.setAllowance(allowance);
        result.setBasicSalary(gajiPokok);
        return ResponseEntity.ok(result);
    }

//    Manager
    @GetMapping("/manager/{family}/{overtime}")
    public ResponseEntity<OutputDto<InfoDto>> endPointGetManager(@PathVariable("family") Integer family,
                                                                 @PathVariable("overtime") Integer overtime)
    {
        InfoDto info = new InfoDto();
        info.setFamily(family);
        info.setOvertime(overtime);
        AllowanceDto allowance = new AllowanceDto();
        Integer tunjanganFamily = hitungManager.tunjanganFamily(info);
        Integer tunjanganOvertime = hitungManager.tunjanganOvertime(info);
        allowance.setFamily(tunjanganFamily);
        allowance.setOvertime(tunjanganOvertime);
        Integer gajiPokok = hitungManager.gajiPokok();
        OutputDto result = new OutputDto<>();
        result.setInfo(info);
        result.setAllowance(allowance);
        result.setBasicSalary(gajiPokok);
        return ResponseEntity.ok(result);
    }

    @PostMapping("/manager")
    public ResponseEntity<OutputDto<InfoDto>> endPointPostManager(@RequestBody InfoDto info)
    {
        AllowanceDto allowance = new AllowanceDto();
        Integer tunjanganFamily = hitungManager.tunjanganFamily(info);
        Integer tunjanganOvertime = hitungManager.tunjanganOvertime(info);
        allowance.setFamily(tunjanganFamily);
        allowance.setOvertime(tunjanganOvertime);
        Integer gajiPokok = hitungManager.gajiPokok();
        OutputDto result = new OutputDto<>();
        result.setInfo(info);
        result.setAllowance(allowance);
        result.setBasicSalary(gajiPokok);
        return ResponseEntity.ok(result);
    }

//    Senior Employee
    @GetMapping("/senioremp/{family}/{overtime}")
    public ResponseEntity<OutputDto<InfoDto>> endPointGetSeniorEmp(@PathVariable("family") Integer family,
                                                                   @PathVariable("overtime") Integer overtime)
    {
        InfoDto info = new InfoDto();
        info.setFamily(family);
        info.setOvertime(overtime);
        AllowanceDto allowance = new AllowanceDto();
        Integer tunjanganFamily = hitungSeniorEmp.tunjanganFamily(info);
        Integer tunjanganOvertime = hitungSeniorEmp.tunjanganOvertime(info);
        allowance.setFamily(tunjanganFamily);
        allowance.setOvertime(tunjanganOvertime);
        Integer gajiPokok = hitungSeniorEmp.gajiPokok();
        OutputDto result = new OutputDto<>();
        result.setInfo(info);
        result.setAllowance(allowance);
        result.setBasicSalary(gajiPokok);
        return ResponseEntity.ok(result);
    }

    @PostMapping("/senioremp")
    public ResponseEntity<OutputDto<InfoDto>> endPointPostSeniorEmp(@RequestBody InfoDto info)
    {
        AllowanceDto allowance = new AllowanceDto();
        Integer tunjanganFamily = hitungSeniorEmp.tunjanganFamily(info);
        Integer tunjanganOvertime = hitungSeniorEmp.tunjanganOvertime(info);
        allowance.setFamily(tunjanganFamily);
        allowance.setOvertime(tunjanganOvertime);
        Integer gajiPokok = hitungSeniorEmp.gajiPokok();
        OutputDto result = new OutputDto<>();
        result.setInfo(info);
        result.setAllowance(allowance);
        result.setBasicSalary(gajiPokok);
        return ResponseEntity.ok(result);
    }

//    Default Employee
    @GetMapping("/defaultemp/{family}/{overtime}")
    public ResponseEntity<OutputDto<InfoDto>> endPointGetDefaultEmp(@PathVariable("family") Integer family,
                                                                   @PathVariable("overtime") Integer overtime)
    {
        InfoDto info = new InfoDto();
        info.setFamily(family);
        info.setOvertime(overtime);
        AllowanceDto allowance = new AllowanceDto();
        Integer tunjanganFamily = hitungDefaultEmp.tunjanganFamily(info);
        Integer tunjanganOvertime = hitungDefaultEmp.tunjanganOvertime(info);
        allowance.setFamily(tunjanganFamily);
        allowance.setOvertime(tunjanganOvertime);
        Integer gajiPokok = hitungDefaultEmp.gajiPokok();
        OutputDto result = new OutputDto<>();
        result.setInfo(info);
        result.setAllowance(allowance);
        result.setBasicSalary(gajiPokok);
        return ResponseEntity.ok(result);
    }

    @PostMapping("/defaultemp")
    public ResponseEntity<OutputDto<InfoDto>> endPointPostDefaultEmp(@RequestBody InfoDto info)
    {
        AllowanceDto allowance = new AllowanceDto();
        Integer tunjanganFamily = hitungDefaultEmp.tunjanganFamily(info);
        Integer tunjanganOvertime = hitungDefaultEmp.tunjanganOvertime(info);
        allowance.setFamily(tunjanganFamily);
        allowance.setOvertime(tunjanganOvertime);
        Integer gajiPokok = hitungDefaultEmp.gajiPokok();
        OutputDto result = new OutputDto<>();
        result.setInfo(info);
        result.setAllowance(allowance);
        result.setBasicSalary(gajiPokok);
        return ResponseEntity.ok(result);
    }
}

package com.uts.advswe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UtsController {

    @Autowired
    private JohnTravoltaService johnTravoltaService;

    @Autowired
    private PersamaanKuadratService persamaanKuadratService;

    // Halaman Utama dengan Form Input Dinamis
    @GetMapping("/")
    public String home() {
        return "<html>" +
               "<head>" +
               "  <title>UTS AdvSWE - Keino Aflah</title>" +
               "  <style>" +
               "    body { font-family: Arial, sans-serif; margin: 40px; background-color: #f9f9f9; color: #333; }" +
               "    .card { background: white; padding: 20px; border-radius: 8px; box-shadow: 0 2px 4px rgba(0,0,0,0.1); margin-bottom: 20px; max-width: 600px; }" +
               "    input { padding: 8px; margin: 5px 10px 5px 0; border: 1px solid #ccc; border-radius: 4px; }" +
               "    button { padding: 8px 16px; background-color: #007bff; color: white; border: none; border-radius: 4px; cursor: pointer; }" +
               "    button:hover { background-color: #0056b3; }" +
               "  </style>" +
               "</head>" +
               "<body>" +
               "  <h2>Tugas UTS Advanced SWE - Keino Aflah (080)</h2>" +
               "  <hr><br>" +
               
               "  <div class='card'>" +
               "    <h3>1. Kalkulator Gaji John Travolta</h3>" +
               "    <form action='/travolta' method='GET'>" +
               "      <label for='jam'>Masukkan Jam Kerja: </label><br>" +
               "      <input type='number' id='jam' name='jam' value='52' required> " +
               "      <button type='submit'>Hitung Gaji</button>" +
               "    </form>" +
               "  </div>" +

               "  <div class='card'>" +
               "    <h3>2. Rumus Persamaan Kuadrat (ax² + bx + c = 0)</h3>" +
               "    <form action='/kuadrat' method='GET'>" +
               "      <label for='a'>Nilai a: </label>" +
               "      <input type='number' step='any' id='a' name='a' value='1' required style='width:70px;'><br>" +
               "      <label for='b'>Nilai b: </label>" +
               "      <input type='number' step='any' id='b' name='b' value='-3' required style='width:70px;'><br>" +
               "      <label for='c'>Nilai c: </label>" +
               "      <input type='number' step='any' id='c' name='c' value='2' required style='width:70px;'><br><br>" +
               "      <button type='submit'>Hitung Akar</button>" +
               "    </form>" +
               "  </div>" +
               "</body>" +
               "</html>";
    }

    // Endpoint Hasil Perhitungan Gaji John Travolta
    @GetMapping("/travolta")
    public String travolta(@RequestParam(defaultValue = "0") int jam) {
        String hasil = johnTravoltaService.hitungGaji(jam);
        return "<html>" +
               "<head><title>Hasil Hitung Gaji</title></head>" +
               "<body style='font-family: Arial, sans-serif; margin: 40px; background-color: #f9f9f9;'>" +
               "  <div style='background: white; padding: 20px; border-radius: 8px; max-width: 600px; box-shadow: 0 2px 4px rgba(0,0,0,0.1);'>" +
               "    " + hasil + "<br><br>" +
               "    <a href='/'><button style='padding: 8px 16px; background-color: #6c757d; color: white; border: none; border-radius: 4px; cursor: pointer;'>← Kembali ke Menu Utama</button></a>" +
               "  </div>" +
               "</body>" +
               "</html>";
    }

    // Endpoint Hasil Perhitungan Persamaan Kuadrat
    @GetMapping("/kuadrat")
    public String kuadrat(@RequestParam(defaultValue = "0") double a,
                          @RequestParam(defaultValue = "0") double b,
                          @RequestParam(defaultValue = "0") double c) {
        String hasil = persamaanKuadratService.hitungAkar(a, b, c);
        return "<html>" +
               "<head><title>Hasil Persamaan Kuadrat</title></head>" +
               "<body style='font-family: Arial, sans-serif; margin: 40px; background-color: #f9f9f9;'>" +
               "  <div style='background: white; padding: 20px; border-radius: 8px; max-width: 600px; box-shadow: 0 2px 4px rgba(0,0,0,0.1);'>" +
               "    " + hasil + "<br><br>" +
               "    <a href='/'><button style='padding: 8px 16px; background-color: #6c757d; color: white; border: none; border-radius: 4px; cursor: pointer;'>← Kembali ke Menu Utama</button></a>" +
               "  </div>" +
               "</body>" +
               "</html>";
    }
}
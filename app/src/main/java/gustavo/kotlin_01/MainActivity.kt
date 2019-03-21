package gustavo.kotlin_01

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    lateinit var mainListView: ListView

    var dados: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Preenche lista com os valores de 0 a 20
        for ( i in 0 .. 20 ) {
            this.dados.add(i.toString())
        }
        
        // Resgata instância do componente ListView
        this.mainListView = findViewById(R.id.main_list_view)

        // Preenche o valor do adapter
        this.mainListView.adapter = getAdapterByArray(this.dados)
    }

    private fun getAdapterByArray(dados: ArrayList<String>): ArrayAdapter<String> {
        return ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dados)
    }
}

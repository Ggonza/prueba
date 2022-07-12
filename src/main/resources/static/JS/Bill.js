const lista = document.getElementById('itemsProd')
var contador = 1
function addProducto() {
    const arrayElement = ['num1']

    arrayElement.forEach(item =>{
        lista.innerHTML += `<div class="card-header">
                                                                <h5>${contador}</h5>
                                                            </div>
                                                            <div class="card-body row">
                                                                <div class="form-group col-12">
                                                                    <label for="exampleInputPassword1">Nombre de producto</label>
                                                                    <select class="form-select form-control">
                                                                        <option selected>. . .</option>
                                                                        <option value="item 1">producto 1</option>
                                                                        <option value="item 2">producto 2</option>
                                                                        <option value="item 3">producto 3</option>
                                                                    </select>
                                                                </div>

                                                                <div class="input-group col-6">
                                                                    <div class="input-group-prepend">
                                                                        <span class="input-group-text" id="basic-addon1">
                                                                            <i class="fa-solid fa-dollar-sign"></i>
                                                                        </span>
                                                                    </div>
                                                                    <input type="text" class="form-control" placeholder="Precio" aria-label="Username" aria-describedby="basic-addon1">
                                                                </div>
                                                                <div class="input-group col-6">
                                                                    <div class="input-group-prepend">
                                                                        <span class="input-group-text" id="basic-addon1">
                                                                            <i class="fa-solid fa-sack-dollar"></i>
                                                                        </span>
                                                                    </div>
                                                                    <input type="text" class="form-control" placeholder="Cantidad" aria-describedby="basic-addon1">
                                                                </div>
                                                            </div>`
    })
    contador++
    console.log(contador)
}

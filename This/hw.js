let group = {
    title: 'Masa2022-2023',
    students: ['Tony', 'Artur', 'Ionatan'],
    showList: function (){
        const show = function (name)
        {
            console.log(`${this.title}: ${name}`)
        }
    this.students.forEach(show)
    }
}

group.showList()
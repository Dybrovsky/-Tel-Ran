class Student extends React.Component {
    render() {
        return (
            <div>
                <h1>{this.props.name}</h1>
                <h2>{`Age: ${this.props.age}`}</h2>
                
                
            </div>
        );
    }


}

ReactDOM.render(
    <div>
        <Student name={'Tony'} age={21}/>
        <Student name={'Artur'} age={25}/>
        <Student name={'Fedor'} age={30}/>
    </div>, document.getElementById('root')
)

// props: {
//     name: 'Tony',
//         age: 21
// }

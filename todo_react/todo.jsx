class Task extends React.Component {
    render() {
        return (
            <div className='box'>
                <div>{this.props.task}</div>
                <button className={'btn light'}>Edit</button>
                <button className={'btn red'}>Remove</button>
            </div>
        );
    }
}

ReactDOM.render(
    <div className={'field'}>
        <Task task={'Task1'}/>
        <Task task={'Task2'}/>
        <Task task={'Task3'}/>
    </div>, document.getElementById('root')
)
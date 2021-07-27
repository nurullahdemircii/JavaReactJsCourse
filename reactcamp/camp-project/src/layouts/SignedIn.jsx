import React from 'react'
import { Dropdown, Image, Menu } from 'semantic-ui-react'

export default function SignedIn({signOut}) {
    return (
        <div>
            <Menu.Item>
                <Image avatar spaced="right" src="https://media-exp1.licdn.com/dms/image/C4D35AQEH1w6g1WjpHw/profile-framedphoto-shrink_200_200/0/1617037240868?e=1627484400&v=beta&t=JFkWzpN_ismdYTrR-miW4shC5Yh2DO3rXqgGq9vjKw8" />
                <Dropdown pointing="top left" text="Nurullah">
                    <Dropdown.Menu>
                        <Dropdown.Item text="Bilgilerim" icon="info" />
                        <Dropdown.Item onClick={signOut} text="Çıkış Yap" icon="sign-out" />
                    </Dropdown.Menu>
                </Dropdown>
            </Menu.Item>
        </div>
    )
}
